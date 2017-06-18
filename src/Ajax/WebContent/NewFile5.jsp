<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		var p1 = {name:"小明",gender:"男性"};
		/* alert(p1.name); 
		alert(p1.gender);

		var ps = [{name:"小明",gender:"女性"},{name:"小刚",gender:"男性"},{name:"小三",gender:"女性"}]
		for(var i=0; i<ps.length;i++){
			alert(ps[i].name);
			} */

		//遍历对象中的所有属性
		for(a in p1){//用中括号运算符打印属性的值
			alert(p1[a]);
			}
	</script>
</body>
</html>