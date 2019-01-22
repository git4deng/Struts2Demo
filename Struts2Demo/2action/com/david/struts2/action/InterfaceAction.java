package com.david.struts2.action;

import com.opensymphony.xwork2.Action;

public class InterfaceAction implements Action {

	@Override
	public String execute() throws Exception {
		//好处：是的我们编程更加规范
		System.out.println("这是action 实现Action接口的方式实现！");
		return Action.SUCCESS;
	}

}
