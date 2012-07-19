package net.bhl.cdt.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

public class TestEditor extends EditorPart {

	public static final String ID = "net.bhl.cdt.ui.editors.TestEditor"; //$NON-NLS-1$

	public TestEditor() {
	}

	/**
	 * Create contents of the editor part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
			}
		});
		combo.setBounds(10, 10, 91, 23);
		
		Combo combo_1 = new Combo(container, SWT.NONE);
		combo_1.setBounds(76, 98, 91, 23);

	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// Do the Save operation
	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// Initialize the editor part
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}
