package net.bhl.cdt.client.auth;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.log.Logger;

import waffle.windows.auth.IWindowsAccount;
import waffle.windows.auth.impl.WindowsAuthProviderImpl;

@SuppressWarnings("restriction")
public class CDTAuthenticator {
	private WindowsAuthProviderImpl winAuthProvider = new WindowsAuthProviderImpl();
	
	@Inject
	private Logger logger;
	
	public CDTAuthenticator() {
	}
	
	@PostConstruct
	public void CollectUserInformation() {
		IWindowsAccount account = winAuthProvider.lookupAccount(System.getProperty("user.name"));
		
		logger.info("User logged in: " + account.getDomain() + " " + account.getName());
	}
}
