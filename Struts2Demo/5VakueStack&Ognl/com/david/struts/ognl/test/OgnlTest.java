package com.david.struts.ognl.test;

import java.util.HashMap;
import java.util.Map;

import com.david.struts2.objectdata.domain.User;

import ognl.Ognl;
import ognl.OgnlException;

public class OgnlTest {

	public static void main(String[] args) throws OgnlException {
		//原则上，数据分为常用的和不常用的，常用的一般是小部分数据，不常用的一般是大数据。
		//表达式：常用数据直接取，不常用的加#号取
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "david");
		map.put("age", "22");
		
		User u=new User();
		u.setName("DAVID");
		Object obj1 = Ognl.getValue("name",map,u);
		System.out.println("根数据："+obj1);
		Object obj2 = Ognl.getValue("#name",map,u);
		System.out.println("非根数据："+obj2);

	}

}
