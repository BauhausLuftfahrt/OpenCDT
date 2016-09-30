package net.bhl.cdt.client.e4.auth;

import java.util.Date;

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
	
	public void loginUser(String username) {
		setUsername(username);
		setLoginDate(new Date());
	}
}
