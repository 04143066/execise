<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="te xt/html; charset=ISO-8859-1">
<title>检测用户名是否可用</title>
<script type="text/javascript" src="js/util.js"></script>
<script type="text/javascript">
	window.onload=function(){
		document.getElementById("username").onblur=function(){//失去焦点
				if(this.value==""){
					document.getElementById("msg").innerHTML="<font color='red'>请输入用户名</font>"
					this.focus();//恢复焦点
					return;
					}
				//发出异步请求
				var xhr=getXHR();
				xhr.onreadystatechange=function(){
						if(xhr.readyState==4){
								if(xhr.status==200){
									//alert(xhr.responseText);
									//alert(xhr)
									document.getElementById("msg").innerHTML=xhr.responseText;
								}	
						}
				}
				/*xhr.open("GET","ServletDemo2?username="+this.value+"&time="+new Date().getTime());
				xhr.send(null); */
				xhr.open("POST","ServletDemo2?username="+this.value+"&time="+new Date().getTime());
				xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
				xhr.send(null);
		}
	}
	
</script>
</head>
<body>
<form action="ServletDemo2" method="post" >
	用户名：<input type="text" id="username" name="username"/><span id="msg"></span></span><br/>
	密码：<input type="password" id="password" name="password"/><br/>
	<input type="submit" value="注册"/>
</form>
</body>
</html>