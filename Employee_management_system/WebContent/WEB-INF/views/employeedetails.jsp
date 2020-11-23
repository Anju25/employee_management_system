<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./style/style2.css">
</head>
<body>
<nav>
<ul>
  <li><h2>Employee Management</h2></li>
	<ul>
		<li><a href="${pageContext.request.contextPath}/login"><h4>logout</h4></a></li>
	</ul>
</ul>
</nav>
<div>
	<ul>
	<li><a href="${pageContext.request.contextPath}/Add"><h3>Add</h3></a></li>
	<li><a href="${pageContext.request.contextPath}/Delete"><h3>delete</h3></a></li>
	<li><a href="${pageContext.request.contextPath}/searching"><h3>search</h3></a></li>
	<li><a href="${pageContext.request.contextPath}/View"><h3>view</h3></a></li>
	</ul>
	${message}
</div>
</body>
</html>