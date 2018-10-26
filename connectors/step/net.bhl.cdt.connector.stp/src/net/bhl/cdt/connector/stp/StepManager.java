package net.bhl.cdt.connector.stp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;

import jsdai.SProduct_definition_schema.AProduct;
import jsdai.SProduct_definition_schema.EProduct;
import jsdai.SProduct_structure_schema.ANext_assembly_usage_occurrence;
import jsdai.SProduct_structure_schema.ENext_assembly_usage_occurrence;
import jsdai.lang.ASdaiModel;
import jsdai.lang.SdaiException;
import jsdai.lang.SdaiIterator;
import jsdai.lang.SdaiModel;
import jsdai.lang.SdaiRepository;
import jsdai.lang.SdaiSession;
import jsdai.lang.SdaiTransaction;
import model.engineering.Component;
import model.engineering.EngineeringFactory;
import net.bhl.cdt.util.constants.StringConstants;
import net.bhl.oida.bridge.service.OIDABridge;
import net.bhl.oida.bridge.service.OIDABridgeException;
import net.bhl.oida.ontology.model.owlontology.Ontology;
import net.bhl.oida.ontology.model.owlontology.OntologyClass;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2018-04-17
 *
 */
public class StepManager {
    public static StepManager INSTANCE = new StepManager();

    private StepManager() {
	Properties prop = new Properties();
	prop.setProperty("repositories", "C:\\Users\\michael.shamiyeh\\sdaiRepos");

	try {
	    SdaiSession.setSessionProperties(prop);
	} catch (SdaiException e) {
	    e.printStackTrace();
	}
    }

    public model.engineering.System ImportStepFile(final String stepFilePath, boolean useDictionary, OIDABridge oidaBridge) {
	model.engineering.System c = EngineeringFactory.eINSTANCE.createSystem();
	c.setName(stepFilePath.substring(stepFilePath.lastIndexOf(StringConstants.BACKSLASH) + 1));
	c.setId(c.getName().replaceAll(StringConstants.DOT, StringConstants.EMPTY));

	HashMap<Component, CSVEntry> csvEntries = new HashMap<Component, StepManager.CSVEntry>();
	int mappedEntries = 0;
	int unmappedEntries = 0;

	// Read dictionary file, if available:
	Map<String, String> dictionaryENG = new HashMap<String, String>();
	Map<String, String> dictionaryGER = new HashMap<String, String>();
	if (useDictionary) {
	    File dictionaryFile = new File(stepFilePath.concat("_Dictionary.csv"));

	    if (dictionaryFile.isFile()) {
		BufferedReader br = null;
		try {
		    br = new BufferedReader(new FileReader(dictionaryFile));
		    String line = StringConstants.EMPTY;
		    while ((line = br.readLine()) != null) {
			String[] dictionaryEntry = line.split(StringConstants.SEMICOLON);

			dictionaryENG.put(dictionaryEntry[0], dictionaryEntry[1]);
			dictionaryGER.put(dictionaryEntry[0], dictionaryEntry[2]);
		    }

		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
			try {
			    br.close();
			} catch (IOException e) {
			    e.printStackTrace();
			}
		    }
		}
	    }
	}

	SdaiSession session = null;
	try {
	    session = SdaiSession.openSession();
	    SdaiTransaction trans = session.startTransactionReadWriteAccess();

	    SdaiRepository repo = null;

	    try {
		repo = session.importClearTextEncoding(null, stepFilePath, null);
		ASdaiModel models = repo.getModels();
		SdaiIterator modelIterator = models.createIterator();

		while (modelIterator.next()) {
		    SdaiModel model = models.getCurrentMember(modelIterator);

		    if (model.getMode() == SdaiModel.NO_ACCESS)
			model.startReadOnlyAccess();

		    Map<String, Component> productMap = new HashMap<String, Component>();

		    // 1: Create model elements for all products:
		    AProduct products = (AProduct)model.getInstances(EProduct.class);
		    SdaiIterator productsIterator = products.createIterator();
		    while (productsIterator.next()) {
			EProduct product = products.getCurrentMember(productsIterator);

			Component element = EngineeringFactory.eINSTANCE.createComponent();
			element.setId(product.getPersistentLabel().replace(StringConstants.HASHTAG, StringConstants.EMPTY));

			String partNr = product.getName(null);
			element.setName(partNr);

			String dictionaryName = StringConstants.EMPTY;
			if (useDictionary) {
			    if (dictionaryENG.containsKey(partNr)) {
				dictionaryName = dictionaryENG.get(partNr);
				element.setName(dictionaryName + " (" + partNr + ")");
			    } else {
				for (String key : dictionaryENG.keySet()) {
				    if (partNr.contains(key)) {
					dictionaryName = dictionaryENG.get(key);
					element.setName(dictionaryName + " (" + partNr + ")");
					break;
				    }
				}
			    }
			}

			if (!csvEntries.containsKey(element)) {
			    CSVEntry entry = new CSVEntry();
			    entry.componentName = partNr;

			    if (!dictionaryName.equals(StringConstants.EMPTY)) {
				entry.ontologyClass = dictionaryName;
				entry.ontologyClassTermFrequency = 1;
				csvEntries.put(element, entry);
				mappedEntries++;
			    } else
				unmappedEntries++;
			}

			productMap.put(product.getPersistentLabel(), element);
		    }

		    // 2: Read next assembly usage entries for part-of
		    // relations:
		    ANext_assembly_usage_occurrence next_occurrences = (ANext_assembly_usage_occurrence)model.getInstances(ENext_assembly_usage_occurrence.class);
		    SdaiIterator next_occurrences_Iterator = next_occurrences.createIterator();
		    while (next_occurrences_Iterator.next()) {
			ENext_assembly_usage_occurrence next_occurrence = next_occurrences.getCurrentMember(next_occurrences_Iterator);

			String relatingId = next_occurrence.getRelating_product_definition(null).getFormation(null).getOf_product(null).getPersistentLabel();
			String relatedId = next_occurrence.getRelated_product_definition(null).getFormation(null).getOf_product(null).getPersistentLabel();

			Component parent = productMap.get(relatingId);
			Component child = productMap.get(relatedId);

			child.setContainingComponent(parent);
			parent.getSubComponents().add(child);
		    }

		    // 3: Add all model elements with undefined super element to
		    // the model container:
		    for (Component element : productMap.values()) {
			if (element.getContainingComponent() == null)
			    c.getComponents().add(element);
		    }
		}
	    } catch (SdaiException ex) {
		ex.printStackTrace();
	    }

	    trans.endTransactionAccessAbort();
	    repo.closeRepository();
	    repo.deleteRepository();
	    session.closeSession();
	} catch (SdaiException e) {
	    e.printStackTrace();
	    try {
		if (session != null)
		    session.closeSession();
	    } catch (SdaiException e1) {
		e1.printStackTrace();
	    }
	}

	try {
	    int entriesFound = 0;

	    Ontology o = oidaBridge.getReferenceOntology();

	    for (CSVEntry entry : csvEntries.values()) {
		entry.ontologyClass = entry.ontologyClass.replace(StringConstants.SPACE, StringConstants.UNDERSCORE).replace(StringConstants.COMMA, StringConstants.EMPTY);

		boolean found = false;
		for (OntologyClass clazz : o.getClasses()) {
		    if (clazz.getName().toUpperCase().equals(entry.ontologyClass.toUpperCase())) {
			entry.ontologyClass = clazz.getName();
			entriesFound++;
			found = true;
			break;
		    }
		}

		if (!found) {
		    System.out.println(entry.ontologyClass + " not found.");
		    entry.toRemove = true;
		}
	    }

	    System.out.println(entriesFound + " of " + csvEntries.values().size() + " Ontology-Entries found!");
	} catch (OIDABridgeException e1) {
	    e1.printStackTrace();
	}

	try {
	    setTermFrequencies(c.getComponents(), csvEntries, 0);
	    exportCSV(csvEntries, stepFilePath.concat("_Mapping.csv"));
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

	System.out.println((double)mappedEntries / csvEntries.size() * 100 + "% of Parts successfully mapped.");
	System.out.println((double)unmappedEntries / csvEntries.size() * 100 + "% of Parts not mapped.");

	return c;
    }

    private void setTermFrequencies(EList<Component> components, HashMap<Component, CSVEntry> csvEntries, int i) {
	for (Component c : components) {
	    if (csvEntries.containsKey(c)) {
		int componentTermFrequency = 10 - i * 2;
		int entityTermFrequency = 5 - i;

		if (componentTermFrequency < 1)
		    componentTermFrequency = 1;
		
		if (entityTermFrequency < 1)
		    entityTermFrequency = 1;

		csvEntries.get(c).componentTermFrequency = componentTermFrequency;
		csvEntries.get(c).ontologyClassTermFrequency = entityTermFrequency;
	    }
	    
	    setTermFrequencies(c.getSubComponents(), csvEntries, i + 1);
	}
    }

    private void exportCSV(HashMap<Component, CSVEntry> csvEntries, String path) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter(new File(path));

	pw.write("PARTNR;ONTOLOGYENTITYIRI;PART_TERMFREQUENCY;ENTITY_TERMFREQUENCY" + StringConstants.NEWLINE);

	for (CSVEntry entry : csvEntries.values()) {
	    if (!entry.toRemove) {
		StringBuilder sb = new StringBuilder();
		sb.append(entry.componentName);
		sb.append(StringConstants.SEMICOLON);
		sb.append("liebherr:");
		sb.append(entry.ontologyClass);
		sb.append(StringConstants.SEMICOLON);
		sb.append(entry.componentTermFrequency);
		sb.append(StringConstants.SEMICOLON);
		sb.append(entry.ontologyClassTermFrequency);
		sb.append(StringConstants.SEMICOLON);
		sb.append(StringConstants.NEWLINE);

		pw.write(sb.toString());
	    }
	}

	pw.close();
    }

    private class CSVEntry {
	public String componentName;
	public String ontologyClass;
	public int componentTermFrequency;
	public int ontologyClassTermFrequency;
	public boolean toRemove = false;

	public CSVEntry() {
	}
    }
}
