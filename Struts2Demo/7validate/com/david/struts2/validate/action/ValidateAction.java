package com.david.struts2.validate.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {
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
	@Override
	public void validate() {
		System.out.println("Ĭ����֤��");
		super.validate();
	}
	public String login(){
		System.out.println("����ǵ�½������");
		return Action.SUCCESS;
	}
	public void validateLogin(){
		System.out.println("�Զ�����֤����");
		if(!"123456".equals(pwd)){
			this.addActionError("�������");
		}
	}
}
