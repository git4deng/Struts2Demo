package com.david.struts2.servletApi;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.Action;

public class ServletApiAction implements ServletRequestAware, ServletResponseAware {
	private HttpServletRequest req;
	private HttpServletResponse resp;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.resp=response;

	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.req=request;

	}
	public String method3(){
		//验证一下这2个对象是否有效
		req.getSession().setAttribute("test", "method3");
		resp.addCookie(new Cookie("mycookie", "method3"));
		return Action.SUCCESS;
	}
}
