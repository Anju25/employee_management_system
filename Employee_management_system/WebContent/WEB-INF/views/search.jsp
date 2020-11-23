<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
<link type="text/css" rel="stylesheet" href="./style/delete.css">
</head>
<body>
<nav>
<ul>
  <li><h2>Employee Management</h2></li>
  <li><a href="${pageContext.request.contextPath}/emp"><h3>Back</h3></a></li>
</ul>
</nav>
<div class="form-design">
<form action="${pageContext.request.contextPath}/searching" method="post">
${message}
<h3>enter the id to search</h3>
<label class="label" for="email">Email</label>
<input class="text" name="email" id="email">
 <div id="button">
<button name="submit" type="submit">submit</button>
<button name="reset" type="reset">reset</button>
</div>
</form>
</div>
</body>
</html>