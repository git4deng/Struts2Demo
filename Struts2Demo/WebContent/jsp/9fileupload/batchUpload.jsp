<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>批量上传</title>
<style type="text/css">
	p{margin: 5px;}
</style>
</head>
<body>                                                                
	<form action="../../file/batchUpload.action" method="post" enctype="multipart/form-data">
		文件：<input type="file" name="file"><input type="button" value="添加" id="btn">
		<div id="files">
		
		</div>
		<input type="submit" value="上传">
	</form>
</body>
<script type="text/javascript" src="../../js/lib/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn').click(function(){
			var feild="<p><input type='file' name='file'><input type='button' value='删除' onclick='remove(this)' ></p>";
			$('#files').append(feild);
		});
	});
	
	function remove(o){
		$(o).parent().remove();
	}
	
	
	
</script>
</html>