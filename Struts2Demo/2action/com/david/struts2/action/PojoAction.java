package com.david.struts2.action;

public class PojoAction {
	public String execute(){
		//优点：自定义一个普通的接口，不具有侵入性（继承，实现）
		System.out.println("这个action的POJO的实现方式");
		return "success";
	}
}
