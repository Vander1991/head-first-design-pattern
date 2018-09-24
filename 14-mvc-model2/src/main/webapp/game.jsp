<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>猜数字游戏</title>

<!-- 引入BootStrap的CSS -->
<link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.js"></script>

<script type="text/javascript">
$(function() {
	//使用JavaScript获取属性tips
	var tips = '${tips}'
	console.info("tips =" + tips);
	$("h1").html(tips);
});

function play(){
	var number =  $("#number").val();
	//正则表达式 :只允许填写数字
	var regex = /^\d+$/;
	if(regex.test(number)){
		$("#playForm").submit();
	} else {
		//将h1设置成红色
		$("h1").css("color", "#FF0000");
	}
	
}

function start(){
	$("#startForm").submit();
}
</script>

</head>
<body>
	<body style="text-align: left;">
	<h1>请输入0-100的整数!</h1>
	<form action="play" class="form-inline" method="post" id="playForm">
		<div class="input-group">
			<input type="text" class="input-middle" name="number" id="number" />
			<button type="button" class="btn btn-info" onclick="play()">提交</button>
			<button type="button" class="btn btn-info" onclick="start()">重新开始游戏</button>
		</div>
	</form>
	<form action="start" class="form-inline" method="post" id="startForm">
	</form>
</body>
</body>
</html>