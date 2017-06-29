package net.bhl.cdt.core.auth;

import java.util.Date;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTAuthService {
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	private void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	private Date loginDate;
	
	public CDTAuthService() {
	}
	
	public void initialize() {
		loginUser(System.getProperty("user.name"));
	}
	
	public void loginUser(String username) {
		setUsername(username);
		setLoginDate(new Date());
	}
}
