package com.david.struts.interceptor.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		

	}

	@Override
	public void init() {
		System.out.println("拦截器初始化中。。。。。");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取actionName,如果是login直接放过
		String actionName = invocation.getInvocationContext().getName();	
		if("login".equals(actionName)) return invocation.invoke();
		
		//然后从session中获取用户登陆信息
		Object name = invocation.getInvocationContext().getContext().getSession().get("name");
		//如果未登录，返回登陆页面
		if(name==null) return Action.LOGIN;
		
		
		return invocation.invoke();
	}

}
