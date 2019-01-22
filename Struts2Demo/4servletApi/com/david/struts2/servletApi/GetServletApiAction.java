package com.david.struts2.servletApi;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class GetServletApiAction {
	@SuppressWarnings("unchecked")
	public String method1(){
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		//session存个值，在jsp页面获取
		session.put("test", "testValue");
		//这个方法相当于获取的是HttpServletRequest对象的attributes
		Map<String,Object> request=	(Map<String, Object>) ActionContext.getContext().get("request");
		//获取application
		Map<String, Object> application = ActionContext.getContext().getApplication();
		//获取，	parameters 也是一个Map,HttpParameters实现了Map<String, Parameter>, Cloneable接口
		HttpParameters parameters = ActionContext.getContext().getParameters();	
		Map<String, Parameter> paraMap=(Map<String, Parameter>)parameters;
		//获取url传过来的以
		String value = paraMap.get("key").getValue();
		System.out.println("value====="+value);
		return Action.SUCCESS;
	}
	
	public String method2(){
		//通过ActionContext.getContext()直接获取request对象，当然其它对象也可以获取（session对象除外）
		HttpServletRequest req = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpServletResponse resp = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
		//操作一下seesion
		req.getSession().setAttribute("test", "method2");
		resp.addCookie(new Cookie("mycookie", "method2"));
		return Action.SUCCESS;
	}
	public String method4(){
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse resp = ServletActionContext.getResponse();
		//验证一下这2个对象是否有效
		req.getSession().setAttribute("test", "method4");
		resp.addCookie(new Cookie("mycookie", "method4"));
		return Action.SUCCESS;
	}
}
