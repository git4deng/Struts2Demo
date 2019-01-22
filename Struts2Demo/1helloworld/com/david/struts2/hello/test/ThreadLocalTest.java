package com.david.struts2.hello.test;

public class ThreadLocalTest {

	public static void main(String[] args) {
		//ThreadLocal����ֲ߳̾�����������
		//���Դ����ThreadLocal�еľֲ��������̰߳�ȫ�ģ�����ͨ���鿴set����
		//Դ�룬���ǻ�ȡ��ǰ�̣߳�Ȼ���뵱ǰ�̰߳󶨵�
		final ThreadLocal<String> tl=new ThreadLocal<String>();
		tl.set("David");
		new Thread(new Runnable() {
			public void run() {
				System.out.println("���߳�:"+tl.get());
			}
		}).start();
		
		System.out.println("���߳�:"+tl.get());
	}

}
