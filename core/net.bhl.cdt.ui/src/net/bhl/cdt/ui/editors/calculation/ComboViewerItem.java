package net.bhl.cdt.ui.editors.calculation;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.utilities.basecalculationmodel.ParameterDescriptor;

/**
 * Wrapper class for correlating mappable key and parameter descriptor for display in comboViewer in CalculationEditor.
 * 
 * @author stephan.leutenmayr
 */
public class ComboViewerItem {

	private MappableComponentInterface mappableComponentInterface;
	private ParameterDescriptor parameterDescriptor;

	public ComboViewerItem(MappableComponentInterface i, ParameterDescriptor p) {
		mappableComponentInterface = i;
		parameterDescriptor = p;
	}

	public MappableComponentInterface getMappableComponentInterface() {
		return mappableComponentInterface;
	}

	public void setMappableComponentInterface(MappableComponentInterface mappableComponentInterface) {
		this.mappableComponentInterface = mappableComponentInterface;
	}

	public ParameterDescriptor getParameterDescriptor() {
		return parameterDescriptor;
	}

	public void setParameterDescriptor(ParameterDescriptor parameterDescriptor) {
		this.parameterDescriptor = parameterDescriptor;
	}

}
