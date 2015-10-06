 <%@ include file="/taglibs.jsp"%>
<stripes:layout-definition>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		
		<title>EIAH GL -  ${title}</title>
		
		<!--<link href="${ctx}/Style/forum.css" rel="stylesheet" type="text/css" />-->
		<script type="text/javascript" src="${ctx}/js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="${ctx}/js/jquery-ui-1.8.custom.min.js"></script>
		
		<stripes:layout-component name="html_head"/>
	</head>
	<body>
	<!--  <div id="conteneur">
			<stripes:layout-component name="header">
				<jsp:include page="/Style/header.jsp"/>
			</stripes:layout-component> -->

			<div id="center">		
					<stripes:layout-component name="contents"/>	
			</div>
			
			<!--<stripes:layout-component name="footer">
				<jsp:include page="/Style/footer.jsp"/>
			</stripes:layout-component> -->
	<!--</div>-->
	</body>
</html>
</stripes:layout-definition>