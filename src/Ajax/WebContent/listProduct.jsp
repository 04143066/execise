<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <table border="1" width="438">
	 	<tr>
	 		<th>编号</th>
	 		<th>名称</th>
	 		<th>单价</th>
	 	</tr>
	 	<c:forEach items="${products}" var="p" varStatus="vs">
	 		<tr class="${vs.index%2==0?'odd':'even' }">
	 			<td>${p.id }</td>
	 			<td>${p.name }</td>
	 			<td>${p.price }</td>
	 		</tr>
	 	</c:forEach>
	 </table>
</body>
</html>