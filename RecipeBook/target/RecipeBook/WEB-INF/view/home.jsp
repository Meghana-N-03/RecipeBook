<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Book</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>
</head>
<body>
	
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp" %>
<div class="container-fluid p-0 m-0">
		<img alt="notes_img" src="<c:url value="/Resources/img/dairy.jpg" />"
			width="100%" height="800px">
	</div>
</body>
</html>