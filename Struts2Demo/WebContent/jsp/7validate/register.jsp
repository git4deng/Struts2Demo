<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib  prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:actionerror/>
	<form action="../../validate/login.action" method="post">
		姓名：<input  type="text" name="name"><br>
		密码：<input  type="password" name="pwd"><br>
		<input type="submit" value="登陆">
		
	</form>
</body>
</html>