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
		System.out.println("��������ʼ���С���������");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//��ȡactionName,�����loginֱ�ӷŹ�
		String actionName = invocation.getInvocationContext().getName();	
		if("login".equals(actionName)) return invocation.invoke();
		
		//Ȼ���session�л�ȡ�û���½��Ϣ
		Object name = invocation.getInvocationContext().getContext().getSession().get("name");
		//���δ��¼�����ص�½ҳ��
		if(name==null) return Action.LOGIN;
		
		
		return invocation.invoke();
	}

}
