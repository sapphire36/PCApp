<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript"
	src="js/format+zh_CN,default,corechart.I.js"></script>
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>

<script type="text/javascript">
	gvChartInit();
	jQuery(document).ready(function() {

		jQuery('#myTable5').gvChart({
			chartType : 'PieChart',
			gvSettings : {
				vAxis : {
					title : 'No of players'
				},
				hAxis : {
					title : 'Month'
				},
				width : 650,
				height : 250
			}
		});
	});
</script>
</head>


<body>

	<div class="place">
		<span>灌溉设备监控界面</span>
	</div>




</body>
<script type="text/javascript">
	setWidth();
	$(window).resize(function() {
		setWidth();
	});
	function setWidth() {
		var width = ($('.leftinfos').width() - 12) / 2;
		$('.infoleft,.inforight').width(width);
	}
</script>
</html>
