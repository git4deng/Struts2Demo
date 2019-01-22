package com.david.struts.typeConverter.converter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.david.struts.typeConverter.domian.Pointer;

public class PointerConverter extends StrutsTypeConverter{
	 Pointer pointer;
	/**
	 * 将表单提交字符串数据转换成 自定义类型
	 * contex 即ActionContext
	 * values 页面提交过来的字符串数组
	 * toClass 被转换的类型
	 */
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Pointer pointer = null;
		try {
			pointer = (Pointer) toClass.getDeclaredConstructor(null).newInstance(null);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		String value = values[0];
		String x = value.substring(1, value.indexOf(","));
		String y = value.substring(value.indexOf(",")+1, value.length()-1);
		System.out.println("(x,y)=("+x+","+y+")");
		pointer.setX(Integer.parseInt(x));
		pointer.setY(Integer.parseInt(y));
		return pointer;
	}
	/**
	 * 将自定义类型转换成字符串在前台页面输出--ognl表达式获取对象的时候将会调用此方法进行类型转换
	 */
	@Override
	public String convertToString(Map contex, Object obj) {
		Pointer pointer=(Pointer) obj;
		return obj.toString();
	}
}
