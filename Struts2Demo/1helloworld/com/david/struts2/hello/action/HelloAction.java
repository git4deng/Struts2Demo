package com.david.struts2.hello.action;

public class HelloAction {
	public String execute(){
		/**
		 * ע��
		 *    1.��servlet�У�Ĭ��ִ�е�service��������struts2��Ĭ��ִ�е�execute������
		 *    2.��servlet�У�service����������HttpRequest��HttpResponse,�޷���ֵ����struts2�з�������public�ģ�
		 *    �����ַ������ͣ������޲�����
		 */
		System.out.println("hello World!");
		return "success";
	}
}
