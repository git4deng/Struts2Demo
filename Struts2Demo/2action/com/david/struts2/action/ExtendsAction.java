package com.david.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExtendsAction extends ActionSupport {
	//�ô��ǣ�ActionSupport����ṩ������֤�ķ���
	@Override
	public String execute() throws Exception {
		System.out.println("���ʱʵ��actionͨ���̳�ActionSupport�ķ���");
		return SUCCESS;
	}
}
