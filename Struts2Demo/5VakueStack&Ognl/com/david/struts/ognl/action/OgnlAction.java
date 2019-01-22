package com.david.struts.ognl.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class OgnlAction {
	private String name;
	private String pwd;
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
	public String toLogin(){
		return Action.SUCCESS;
	}
	public String login(){
		ActionContext.getContext().getSession().put("pwd", pwd);
		return Action.SUCCESS;
	}
}
