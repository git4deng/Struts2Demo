package com.david.struts2.hello.action;

public class HelloAction {
	public String execute(){
		/**
		 * 注：
		 *    1.在servlet中，默认执行的service方法，在struts2中默认执行的execute方法。
		 *    2.在servlet中，service方法参数是HttpRequest和HttpResponse,无返回值，在struts2中方法都是public的，
		 *    返回字符串类型，而且无参数。
		 */
		System.out.println("hello World!");
		return "success";
	}
}
