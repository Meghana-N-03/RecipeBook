<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>
</head>
<body>
	
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp" %>
<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center">
						<h3>Register Page</h3>
						<c:if test="${not empty msg }">
							<p class="fs-3 fw-bold text-success">${msg }</p>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<form action="registerUser" method="post">
							<div class="mb-3">
								<label>Enter Full Name</label> <input type="text"
									name="fullname" class="form-control">
							</div>

							
							<div class="mb-3">
								<label>Enter Email</label> <input type="email" name="email"
									class="form-control">
							</div>

							<div class="mb-3">
								<label>Enter Password</label> <input type="password"
									name="password" class="form-control">
							</div>

							<button class="btn col-md-12" style="background-color: brown; color: white;">Register</button>
							
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
						
						
</body>
</html>