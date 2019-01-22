package com.david.struts2.validate.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String nameValidate(){
		return Action.SUCCESS;
	}
}
