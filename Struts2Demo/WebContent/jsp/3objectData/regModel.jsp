<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../../object/regModel.action" method="post">
		用户名称:<input type="text" name="name"/><br/>
		用户密码:<input type="password" name="pwd"/><br/>
		用户年龄:<input type="text" name="age"/><br/>
		用户邮箱:<input type="text" name="email"/><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>