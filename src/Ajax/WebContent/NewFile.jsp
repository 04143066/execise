 <%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/util.js"></script>
<script type="text/javascript">
	window.onload=function(){
		document.getElementById("bt1").onclick=function(){
			//发出异步请求：步骤
			
			//1得到xhr(XMLHttpRequest)对象
			//alert(111)
			var xhr = getXHR();
			//alert(xhr);
			//2注册状态变化监听器
			xhr.onreadystatechange=function(){
				//做出具体的处理
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						alert("服务器已经响应了，去看看吧");
					}
				}
			}
			//3建立与服务器的连接
			//如果访问地址相同，浏览器就不会真正的发出请求
			xhr.open("GET","ServletDemo1?time="+new Date().getTime());
			//4向服务器发出请求
			xhr.send(null);//没有正文
		} 
		//alert("oyeas");
	}
	
</script>
<title>Insert title here</title>
</head>
<body>
<input id = "bt1" type="button" value="点我呀"/>
</body>
</html>