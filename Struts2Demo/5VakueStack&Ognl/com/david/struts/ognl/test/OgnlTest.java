package com.david.struts.ognl.test;

import java.util.HashMap;
import java.util.Map;

import com.david.struts2.objectdata.domain.User;

import ognl.Ognl;
import ognl.OgnlException;

public class OgnlTest {

	public static void main(String[] args) throws OgnlException {
		//ԭ���ϣ����ݷ�Ϊ���õĺͲ����õģ����õ�һ����С�������ݣ������õ�һ���Ǵ����ݡ�
		//���ʽ����������ֱ��ȡ�������õļ�#��ȡ
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "david");
		map.put("age", "22");
		
		User u=new User();
		u.setName("DAVID");
		Object obj1 = Ognl.getValue("name",map,u);
		System.out.println("�����ݣ�"+obj1);
		Object obj2 = Ognl.getValue("#name",map,u);
		System.out.println("�Ǹ����ݣ�"+obj2);

	}

}
