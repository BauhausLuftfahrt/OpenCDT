package net.bhl.cdt.reconstruct.cdtmodel;

import java.util.Collection;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;

public class ArrangeLiteratureOnProject {
	
	public ArrangeLiteratureOnProject(){

	}
	
	
	public void arrangeReferenceLiterature(Object oldObj, Object newObj ){
		
		if(oldObj.toString().equals(newObj.toString())){
			
		}else{
			
			Collection<ECPProject> projects = null;
			projects = ECPUtil.getECPProjectManager().getProjects();
			
			
			if(projects.iterator().next().getContents().contains(oldObj)){
				
				projects.iterator().next().getContents().remove(oldObj);
			
		
			}
			
		}
		
		
		
	}


}
