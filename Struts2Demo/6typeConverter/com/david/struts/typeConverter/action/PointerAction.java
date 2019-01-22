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
	 * 常规方式：
	 */
	public String getPointer1(){
		System.out.println();
		return Action.SUCCESS;
	}
	/**
	 * 使用struts类型转换器的方式
	 */
	public String getPointer2(){
		System.out.println(pointer);
		return Action.SUCCESS;
	}
}
