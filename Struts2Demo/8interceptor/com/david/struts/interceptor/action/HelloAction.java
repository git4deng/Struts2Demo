package com.david.struts.interceptor.action;

import com.opensymphony.xwork2.Action;

public class HelloAction {
	//name������֤strutsĬ��������ջ�Ƿ�����ɹ�������struts-interceptor.xml
	private String name;

	public String sayHello() {
		System.out.println("hello interceptor!");
		System.out.println("name:"+name);
		return Action.SUCCESS;
	}
	public String list(){
		return Action.SUCCESS;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
