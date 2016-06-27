 
package net.bhl.cdt.reporting.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;

import reporting.GanttChart;

public class ShowGanttChartPartHandler {
	@Execute
	public void execute() {
		
	}
	
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object selection) {
		if (selection != null && selection instanceof GanttChart)
			return true;
		
		return false;
	}	
}