package com.david.struts2.validate.action;

import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String name;
	private String pwd;
	private int age;
	private Date birthday;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("default method");
		return Action.SUCCESS;
	}
	 public String register(){
		 System.out.println("register method!");
		 return Action.SUCCESS;
	 }
	 
	public void validateRegister(){
		System.out.println("validateRegister!");
		/*if(age<0) {
			System.out.println("age:"+age);
			this.addActionError("ÄêÁäÊäÈë´íÎó");
		}*/
	}
	
	@Override
	public void validate() {
		System.out.println("default validate!");
		super.validate();
	}
	
	
}
