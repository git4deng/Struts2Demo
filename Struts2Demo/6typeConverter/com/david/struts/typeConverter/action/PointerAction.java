package com.david.struts.typeConverter.action;

import com.david.struts.typeConverter.domian.Pointer;
import com.opensymphony.xwork2.Action;

public class PointerAction {
	private Pointer pointer;
	
	public Pointer getPointer() {
		return pointer;
	}
	public void setPointer(Pointer pointer) {
		this.pointer = pointer;
	}
	/**
	 * ���淽ʽ��
	 */
	public String getPointer1(){
		System.out.println();
		return Action.SUCCESS;
	}
	/**
	 * ʹ��struts����ת�����ķ�ʽ
	 */
	public String getPointer2(){
		System.out.println(pointer);
		return Action.SUCCESS;
	}
}
