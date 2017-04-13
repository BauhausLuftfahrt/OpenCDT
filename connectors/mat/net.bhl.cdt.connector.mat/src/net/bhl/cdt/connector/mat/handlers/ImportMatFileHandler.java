package net.bhl.cdt.connector.mat.handlers;

import java.io.IOException;
import java.util.Map;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import com.jmatio.io.MatFileReader;
import com.jmatio.types.MLArray;


public class ImportMatFileHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
        fd.setText("Open");
        fd.setFilterPath("C:/");
        String[] filterExt = { "*.mat", "*.*" };
        fd.setFilterExtensions(filterExt);
        String fileLocation = fd.open();
		
		if (fileLocation != null) {
			MatFileReader mfr;
			try {
				mfr = new MatFileReader( fileLocation );
				
				Map<String, MLArray> mlArrayRetrived = mfr.getContent();
				
		        for (String key : mlArrayRetrived.keySet()) {
		        	System.out.println(mlArrayRetrived.get(key).contentToString());
		        }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//				
//				ECPProject project = ECPHandlerHelper.createProject(shell);
//				project.getContents().add(xmlParser.getVehiclesComponent());
		}
	}
}
