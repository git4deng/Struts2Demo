<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>  
<!--注意此处的 post提交是必须的，enctype="multipart/form-data"也是必须的-->                                                               
	<form action="../../file/fileupload.action" method="post" enctype="multipart/form-data">
		文件：<input type="file" name="file">
		<input type="submit" value="上传">
	</form>
</body>
</html>