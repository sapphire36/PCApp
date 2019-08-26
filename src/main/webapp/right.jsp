<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="js/cloud.js"></script>
<script type="js/jquery.ba-resize.min.js"></script>
<script type="js/jquery.idTabs.min.js"></script>
<script type="js/jsapi.js"></script>
<script type="js/select-ui.min.js"></script>

</head>
<body>

	<div class="place">
		<span>用户信息</span>
	</div>

	<div class="rightinfo">


		<div class="tools">
			<ul class="toolbar">
				<li class="click"><span><img src="images/t01.png" /></span>添加</li>
				<li class="click"><span><img src="images/t02.png" /></span>修改</li>
				<li class="click"><span><img src="images/t03.png" /></span>删除</li>
			</ul>
		</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" checked="checked" /></th>
					<th>编号</th>${map}1111
					<th>姓名</th>
					<th>身份证号码</th>
					<th>电话号码</th>
					<th>所属水栓</th>
					<th>所属水泵</th>
					<th>家庭住址</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="Userinfo">
				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>${Userinfo.user_id }</td>
					<td>${Userinfo.name }</td>
					<td>${Userinfo.ldnumber }</td>
					<td>${Userinfo.phone }</td>
					<td>${Userinfo.machinecde }</td>
					<td>${Userinfo.picture }</td>
					<td>${Userinfo.addr }</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink"> 删除</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
		
		
		$(document).ready(function(){
			$.ajax({
				type: "post",
	            url: "userConfig/getUserList.do",
	            success: function(){
	            },
	            error: function(e){
	            	alert("获取数据失败");
	            }
	            
				
			});

			}
			);

	</script>
</body>

</html>