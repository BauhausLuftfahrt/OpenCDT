package net.bhl.cdt.connector.stp;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

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

/**
 * 
 * @author Michael Shamiyeh
 * @since 2018-04-17
 *
 */
public class StepManager {
    private static StepManager instance;

    public static StepManager Instance() {
	if (instance == null)
	    instance = new StepManager();

	return instance;
    }

    private StepManager() {
	Properties prop = new Properties();
	prop.setProperty("repositories", "C:\\Users\\michael.shamiyeh\\sdaiRepos");

	try {
	    SdaiSession.setSessionProperties(prop);
	} catch (SdaiException e) {
	    e.printStackTrace();
	}
    }

    public model.engineering.System ImportStepFile(final String stepFilePath) {
	model.engineering.System c = EngineeringFactory.eINSTANCE.createSystem();
	c.setName(stepFilePath.substring(stepFilePath.lastIndexOf(StringConstants.BACKSLASH) + 1));
	c.setId(c.getName().replaceAll(StringConstants.DOT, StringConstants.EMPTY));

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
			element.setName(product.getName(null));

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

	return c;
    }
}
