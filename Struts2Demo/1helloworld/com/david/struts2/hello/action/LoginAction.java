package com.david.struts2.hello.action;

public class LoginAction {
	/**
	 * action���������Ʊ���Ҫ�ͱ��б�Ԫ��nameһ�£�����Ϊ�����ṩget set���� Struts2�Զ������������õ���Ӧ������
	 *��jsp�п���ֱ�ӻ�ȡ����ֵ�������ֶ���request���á�
	 */
	private String name;
	private String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute() {
		if("david".equals(name)&&"123456".equals(pwd)){
			System.out.println(name+"��½�ɹ���");
			return "success";
		}else{
			System.err.println("��������˺Ŵ���");
			return "failed";
		}
		
	}

	public String logout(){
		System.out.println("�˳��ɹ���");
		return "success";
	}


}
