<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/util.js"></script>
<script type="text/javascript">
	var xmlDoc;
	window.onload=function(){
		//发出异步请求
		var xhr = getXHR();
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4)
				if(xhr.status==200){
					xmlDoc = xhr.responseXML;
					//alert(xmlDoc);
					
					//给省份赋值
					//1.解析xml文档，得到所有的province元素
					var xmlProvinces = xmlDoc.getElementsByTagName("province");
					//2.遍历province元素，得到他的code和name的值
					for(var i=0;i<xmlProvinces.length;i++){
						var codeValue = xmlProvinces[i].getAttribute("code");
						var nameValue = xmlProvinces[i].getAttribute("name");
						//alert(codeValue+":"+nameValue);
						//3、创建HTML中的option对象，给id=p1的元素添加子元素
						var o = new Option(nameValue,codeValue);//HTML DOM
						document.getElementById("p1").add(o);
					}
				}
		}
		xhr.open("GET","ServletDemo4?time="+new Date().getTime());
		xhr.send(null);
	}

	//省份的变化，引起城市的变化
	function selectCity(provinceObj){
		//取到当前的选项的值
		var selectValue = provinceObj.value;
		//清除城市下拉内容
		document.getElementById("c1").length=1;
		//遍历xml文档中的省份元素，比对code的值
		var xmlProvinces = xmlDoc.getElementsByTagName("province");
		for(var i=0;i<xmlProvinces.length;i++){
			//找到了：把他的子元素city取出来
			if(selectValue == xmlProvinces[i].getAttribute("code")){
				var xmlCitys = xmlProvinces[i].getElementsByTagName("city");
				//给HTML中的city下拉选择添加option
				for(var j=0;j<xmlCitys.length;j++){
					var o = new Option(xmlCitys[j].getAttribute("name"),xmlCitys[j].getAttribute("code"));//HTML DOM
					document.getElementById("c1").add(o);
				}
			}
			
		}
	}
</script>
<title>省市二级联动</title>
</head>
<body>
	省份：<select id="p1"  onchange="selectCity(this)"> 
			<option value="">--请选择--</option>
		</select>
	城市：<select id="c1">
			<option value="">--请选择--</option>
		</select>
</body>
</html>