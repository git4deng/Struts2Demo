package com.david.struts.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * ����action��ִ��ʱ�䣡
 * �˴�������ʵ�ַ�ʽ2�֣�
 * 1.�̳�AbstactInterceptor�����ࣨ������󷽷�ֻ��ʵ����Interceptor�ӿڣ����巽��δд�߼�)
 * 2.ʵ��Interceptor�ӿ�
 * 
 * ʵ�ֲ��裺
 * 1.����������
 * 2.struts.xml�����������Լ�����������
 * 
 * @author David
 *
 */
public class TimeInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ���ķ���
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		long start = System.currentTimeMillis();
		//ִ����һ������������������ִ�������ִ��action
		String result = invocation.invoke();
		
		long end = System.currentTimeMillis();
		System.out.println("ִ�и�action����ʱ��Ϊ��"+(end-start)+"ms!");
		return result;
	}

}
