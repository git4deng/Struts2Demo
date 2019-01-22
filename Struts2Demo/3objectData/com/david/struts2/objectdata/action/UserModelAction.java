package com.david.struts2.objectdata.action;

import com.david.struts2.objectdata.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UserModelAction implements ModelDriven<User> {
	User user=new User();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		return user;
	}
	public String register(){
		System.out.println(user);
		return Action.SUCCESS;
	}
}
