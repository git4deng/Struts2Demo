package com.david.struts2.hello.action;

public class LoginAction {
	/**
	 * action的属性名称必须要和表单中表单元素name一致，并且为属性提供get set方法 Struts2自动将表单数据设置到对应属性上
	 *在jsp中可以直接获取属性值，不用手动向request设置。
	 */
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

	public String execute() {
		if("david".equals(name)&&"123456".equals(pwd)){
			System.out.println(name+"登陆成功！");
			return "success";
		}else{
			System.err.println("密码或者账号错误！");
			return "failed";
		}
		
	}

	public String logout(){
		System.out.println("退出成功！");
		return "success";
	}


}
