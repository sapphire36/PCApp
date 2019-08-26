<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		//顶部导航切换
		$(".nav li a").click(function() {
			$(".nav li a.selected").removeClass("selected")
			$(this).addClass("selected");
		})
	})
</script>


</head>

<body style="background: url(images/topbg.gif) repeat-x;">

	<div class="topleft">
	<!-- 此处图片修改 -->
		<a href="login.jsp" target="_parent"><img src="images/logo.png"
			title="系统首页" /></a>
	</div>

	<ul class="nav">
		<li><a href="default.jsp" target="rightFrame" class="selected"><img
				src="images/icon01.png" title="设备监控" />
				<h2>设备监控</h2></a></li>
		<li><a href="device.jsp" target="rightFrame"><img
				src="images/icon02.png" title="水泵监控" />
				<h2>水泵监控</h2></a></li>
		<li><a href="imglist.jsp" target="rightFrame"><img
				src="images/icon03.png" title="电能参数" />
				<h2>电能参数</h2></a></li>
		<li><a href="tools.jsp" target="rightFrame"><img
				src="images/icon04.png" title="故障查询" />
				<h2>故障查询</h2></a></li>
	</ul>

	<div class="topright">
		<ul>
			<li><a href="index.jsp" target="_parent">退出</a></li>
		</ul>

		<div class="user">
			<span>admin</span>
		</div>

	</div>
</body>
</html>
