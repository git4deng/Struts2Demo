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
		//session���ֵ����jspҳ���ȡ
		session.put("test", "testValue");
		//��������൱�ڻ�ȡ����HttpServletRequest�����attributes
		Map<String,Object> request=	(Map<String, Object>) ActionContext.getContext().get("request");
		//��ȡapplication
		Map<String, Object> application = ActionContext.getContext().getApplication();
		//��ȡ��	parameters Ҳ��һ��Map,HttpParametersʵ����Map<String, Parameter>, Cloneable�ӿ�
		HttpParameters parameters = ActionContext.getContext().getParameters();	
		Map<String, Parameter> paraMap=(Map<String, Parameter>)parameters;
		//��ȡurl����������
		String value = paraMap.get("key").getValue();
		System.out.println("value====="+value);
		return Action.SUCCESS;
	}
	
	public String method2(){
		//ͨ��ActionContext.getContext()ֱ�ӻ�ȡrequest���󣬵�Ȼ��������Ҳ���Ի�ȡ��session������⣩
		HttpServletRequest req = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpServletResponse resp = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
		//����һ��seesion
		req.getSession().setAttribute("test", "method2");
		resp.addCookie(new Cookie("mycookie", "method2"));
		return Action.SUCCESS;
	}
	public String method4(){
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse resp = ServletActionContext.getResponse();
		//��֤һ����2�������Ƿ���Ч
		req.getSession().setAttribute("test", "method4");
		resp.addCookie(new Cookie("mycookie", "method4"));
		return Action.SUCCESS;
	}
}
