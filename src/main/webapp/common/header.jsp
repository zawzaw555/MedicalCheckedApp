<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MedicalCheck</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar shadow-sm bg-body-tertiary mx-2 my-1">
	<div class="container-fluid">
		<% if (session.getAttribute("user") == null) { %>
    		<a class="navbar-brand" href="${pageContext.request.contextPath}/health-home.jsp">Health-PinPin</a>
			<ul class="nav justify-content-end">
  				<li class="nav-item">
    				<a class="nav-link" href="${pageContext.request.contextPath}/servlet/Login.action">ロクイン</a>
  				</li>
			</ul>
		<% } else { %>
			<a class="navbar-brand" href="#">Health-PinPin</a>
			<ul class="nav justify-content-end">
			<li class="nav-item">
    				<a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/LinkControllers?action=input">データ入力</a>
  				</li>
  				<li class="nav-item">
    				<a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/servlet/HealthList.action">データリスト</a>
  				</li>
  				<li class="nav-item">
    				<a class="nav-link" href="${pageContext.request.contextPath}/servlet/Logout.action">ロクアウト</a>
  				</li>
			</ul>
		<% } %>
	</div>
</nav>
