<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--引入struts标签库-->
<%@taglib  prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--action的数据属于值栈，所以ngnl表达式直接获取-->
x:<s:property value="pointer.x"/>
y:<s:property value="pointer.y"/>
<!--EL表达式 获取某个对象是通过会调用该对象的toString方法-->
pointer:${pointer}
</body>
</html>