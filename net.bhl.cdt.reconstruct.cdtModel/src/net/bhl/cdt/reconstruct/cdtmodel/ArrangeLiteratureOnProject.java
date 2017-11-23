package net.bhl.cdt.reconstruct.cdtmodel;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;

import formula.Formula;

public class ArrangeLiteratureOnProject {
	
	public ArrangeLiteratureOnProject(){

	}
	
	
	public void arrangeReferenceLiterature(Object oldObj, Object newObj, Formula formulaObj){
		
		//if(oldObj.toString().equals(newObj.toString())){
		if(oldObj.equals(newObj)){
			
			System.out.println("object is same!!");
			
		}else{
			
			Collection<ECPProject> projects = null;
			
			projects = ECPUtil.getECPProjectManager().getProjects();
			
			//int sizeOfProject = projects.size();
			
			for(Iterator<ECPProject> i = projects.iterator(); i.hasNext();)
			{
	             
				ECPProject project = i.next();
				
				if(project.getContents().contains(formulaObj) && project.getContents().contains(oldObj)){
					project.getContents().remove(oldObj);	
				}
			}
						
		}
		
	}

}
