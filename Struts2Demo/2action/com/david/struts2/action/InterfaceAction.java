package com.david.struts2.action;

import com.opensymphony.xwork2.Action;

public class InterfaceAction implements Action {

	@Override
	public String execute() throws Exception {
		//�ô����ǵ����Ǳ�̸��ӹ淶
		System.out.println("����action ʵ��Action�ӿڵķ�ʽʵ�֣�");
		return Action.SUCCESS;
	}

}
