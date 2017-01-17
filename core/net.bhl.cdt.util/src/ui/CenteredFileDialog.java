package ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class CenteredFileDialog extends Dialog{

    protected Shell shell;
    public FileDialog dialog;

    private int width = 360; // WinXP default
    private int height = 220;

    public CenteredFileDialog(Shell parent, int style) {
        super(parent, style);
        shell = new Shell(getParent(), SWT.APPLICATION_MODAL);
        dialog = new FileDialog(shell, style);
    }

    public Object open() {
        shell.setSize(width, height);

        Rectangle parentBounds = getParent().getBounds();

        shell.setLocation(
          parentBounds.x + (parentBounds.width - width) / 2,
          parentBounds.y + (parentBounds.height - height) / 2);

        Object result = dialog.open();
        shell.dispose();
        return result;
    }
	
}
