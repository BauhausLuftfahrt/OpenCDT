package net.bhl.cdt.ontology.management;

import java.io.InputStream;

import org.apache.jena.ontology.OntDocumentManager;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.shared.JenaException;
import org.apache.jena.util.FileManager;

import net.bhl.cdt.log.service.CDTLogService;

public class OntologyManager {
	private OntDocumentManager docManager = new OntDocumentManager();
	private OntModelSpec ontSpec = new OntModelSpec(OntModelSpec.OWL_MEM_MICRO_RULE_INF);
	
	private static OntologyManager instance;
	public static OntologyManager getInstance() {
		if (instance == null)
			instance = new OntologyManager();
		
		return instance;
	}
	
	private OntologyManager() {
		ontSpec.setDocumentManager(docManager);
	}
	
	public void loadOntologyFromFile(String file, CDTLogService log) {
		OntModel model = ModelFactory.createOntologyModel(ontSpec);
		
		try 
	    {
	        InputStream in = FileManager.get().open(file);
	        try 
	        {
	        	model.read(in, null);
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        log.info("Ontology " + file + " loaded.");
	    } 
	    catch (JenaException je) 
	    {
	        System.err.println("ERROR" + je.getMessage());
	        je.printStackTrace();
	        System.exit(0);
	    }
	}
}
