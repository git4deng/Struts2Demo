package com.david.struts.interceptor.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String name;
	private String pwd;

	public String login() {
		if(!"123456".equals(pwd)|| !"David".equals(name))
			return Action.LOGIN;
		ActionContext.getContext().getSession().put("name", name);
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
