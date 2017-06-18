<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.odd {
	background-color: red;
}

.even {
	background-color: blue;
}
</style>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script type="text/javascript" src="js/util.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
		window.onload=function(){
			document.getElementById("bt1").onclick=function(){
				//发出异步请求
				alert(222);
				var xhr = getXHR();
				alert(xhr);
				xhr.onreadystatechange=function(){
					alert(ddd);
					if(xhr.readyState==4){
						if(xhr.status==200){
							alert(ppp);
							document.getElementById("d1").innerHTML=xhr.responseText;
							// var text = xhr.responseText;//文本
						//	var products = eval("("+text+")");//把文本转成JSON
							//document.getElementById("d1").innerHTML="<table id='t1' border='1' width='438'><tr><th>编号</th><th>名称</th><th>价格</th></tr></table>";
							/* for(var i=0;i<products.length;i++){
								var p = products[i];
								var tableObj = document.getElementById("t1");
								//得到表格对象:HTML DOM
								//调用insertRow插入一行，返回TableRow
								var trObj = tableObj.insertRow(tableObj.rows.length);
								//TableRow的insertCell，返回TableCell
								var idTdObj = trObj.insertCell(trObj.cells.length);
								idTdObj.innerHTML=p.id;
								var nameTdObj = trObj.insertCell(trObj.cells.length);
								nameTdObj.innerHTML=p.name;
								var pricieTdObj = trObj.insertCell(trObj.cells.length);
								pricieTdObj.innerHTML=p.price;
												
							}  */
						
						}
					}
				
				}
				xhr.open("GET","ServletDemo5?time="+new Date().getTime());
				//4向服务器发出请求
				xhr.send(null);//没有正文
			}
		}
	
	</script>
</head>
<body>
	<input type="button" id="bt1" value="显示商品" />
	<hr />
	<div id="d1">aaa</div>
</body>
</html>