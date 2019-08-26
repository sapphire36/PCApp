<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		})
	});
</script>

</head>

<body
	style="background-color: #1c77ac; 
		background-image: url(images/light.png); 
		background-repeat: no-repeat; 
		background-position: center top; 
		overflow: hidden;">



	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>


	<div class="logintop">
		<span>欢迎登录后台管理界面平台</span>
	</div>

	<div class="loginbody">
		<span class="systemlogo"></span>
		<div class="loginbox">
			<ul>
				<form action="${pageContext.request.contextPath }/login.do" method="post">
					<li><input name="username" type="text" class="loginuser" value="" /></li>
					<li><input name="password" type="text" class="loginpwd" value="" /></li>
					<li><input name="" type="submit" class="loginbtn" value="登录" /></li>
				</form>
			</ul>
		</div>
	</div>
	<div class="loginbm">版权所有·山西运城水务局</div>
</body>
</html>
