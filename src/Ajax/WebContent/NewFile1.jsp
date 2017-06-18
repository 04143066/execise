<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	//相当于在js源码上添加了一个trim()方法
		String.prototype.trim=function(){
			return this.replace(/(^\s*)|(\s*$)/g,"");	
		}

		var s1="             abc       ";
		alert("|"+s1+"|");
		alert("|"+s1.trim()+"|");
	</script>
</body>
</html>