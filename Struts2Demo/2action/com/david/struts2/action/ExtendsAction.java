package com.david.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExtendsAction extends ActionSupport {
	//好处是：ActionSupport这个提供其它验证的方法
	@Override
	public String execute() throws Exception {
		System.out.println("这个时实现action通过继承ActionSupport的方法");
		return SUCCESS;
	}
}
