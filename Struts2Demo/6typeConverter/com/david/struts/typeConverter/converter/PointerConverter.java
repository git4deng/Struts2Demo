package com.david.struts.typeConverter.converter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.david.struts.typeConverter.domian.Pointer;

public class PointerConverter extends StrutsTypeConverter{
	 Pointer pointer;
	/**
	 * �����ύ�ַ�������ת���� �Զ�������
	 * contex ��ActionContext
	 * values ҳ���ύ�������ַ�������
	 * toClass ��ת��������
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
	 * ���Զ�������ת�����ַ�����ǰ̨ҳ�����--ognl���ʽ��ȡ�����ʱ�򽫻���ô˷�����������ת��
	 */
	@Override
	public String convertToString(Map contex, Object obj) {
		Pointer pointer=(Pointer) obj;
		return obj.toString();
	}
}
