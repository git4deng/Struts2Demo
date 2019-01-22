package com.david.struts.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 计算action的执行时间！
 * 此处拦截器实现方式2种：
 * 1.继承AbstactInterceptor抽象类（这个抽象方法只是实现了Interceptor接口，具体方法未写逻辑)
 * 2.实现Interceptor接口
 * 
 * 实现步骤：
 * 1.定义拦截器
 * 2.struts.xml配置拦截器以及引用拦截器
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
	 * 核心方法
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		long start = System.currentTimeMillis();
		//执行下一个拦截器，当拦截器执行完后在执行action
		String result = invocation.invoke();
		
		long end = System.currentTimeMillis();
		System.out.println("执行该action所用时间为："+(end-start)+"ms!");
		return result;
	}

}
