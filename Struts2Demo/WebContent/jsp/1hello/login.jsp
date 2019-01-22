<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		<!--  
		注意：此处提交的请求扩展名，一定要与web.xml配置的struts2的核心过滤器保持一致
		即：<url-pattern>*.action</url-pattern> 否则请求根本就走不到filter中去而报404
		-->
	<form action="user/login.action" method="get">
		账号：<input  type="text" name="name"><br>
		密码：<input  type="password" name="pwd"><br>
		<input type="submit" value="登陆">
		
	</form>
</body>
</html>