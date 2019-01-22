package com.david.struts2.hello.test;

public class ThreadLocalTest {

	public static void main(String[] args) {
		//ThreadLocal存放线程局部变量的容器
		//所以存放在ThreadLocal中的局部变量是线程安全的，可以通过查看set方法
		//源码，其是获取当前线程，然后与当前线程绑定的
		final ThreadLocal<String> tl=new ThreadLocal<String>();
		tl.set("David");
		new Thread(new Runnable() {
			public void run() {
				System.out.println("子线程:"+tl.get());
			}
		}).start();
		
		System.out.println("主线程:"+tl.get());
	}

}
