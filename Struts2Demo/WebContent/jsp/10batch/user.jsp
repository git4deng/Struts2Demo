<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../../batch/user.action" method="post">
		姓名:<input type="text" name="name"><br>
		爱好:<input type="checkbox" name="hobbies" value="fish">鱼
			 <input type="checkbox" name="hobbies" value="dog">狗
			 <input type="checkbox" name="hobbies" value="cat">猫<br>
    喜欢的游戏:<input type="checkbox" name="games" value="lol">英雄联盟
     		 <input type="checkbox" name="games" value="dota">dota
     		 <input type="checkbox" name="games" value="cs">cs<br>
	    	 <input type="submit" value="提交">
			 
	</form>
</body>
</html>