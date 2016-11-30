package net.bhl.cdt.client.e4.auth.ui;

import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;

import net.bhl.cdt.client.e4.auth.CDTAuthService;

/**
 * Simple authentication state tool control. Shows login name and login time.
 * @author Michael.Shamiyeh
 *
 */
public class AuthenticationStateToolControl {
	@PostConstruct
	public void createGui(Composite parent, CDTAuthService authService) {
		CLabel l = new CLabel(parent, SWT.NONE);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		l.setText("User: " + authService.getUsername() + " | Login-Time: " + sdf.format(authService.getLoginDate()));
		l.setTopMargin(3);
		l.setBottomMargin(3);
	}
}