package com.david.struts2.objectdata.action;

import com.david.struts2.objectdata.domain.User;

public class RegisterAction {
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String register(){
		System.out.println(user);
		return "success";
	}
}
