<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./style/signup.css">
</head>
<body>
<nav>
<ul>
  <li><h2>Employee Management</h2></li>
	<ul>
		<li><a href="${pageContext.request.contextPath}/Welcome"><h3>home</h3></a></li>
		<li><a href="${pageContext.request.contextPath}/login"><h3>login</h3></a></li>
		<li><a href="${pageContext.request.contextPath}/Signup"><h3>signup</h3></a></li>
		
	</ul>
</ul>
</nav>
<div class="form-design1 form-design"> 
<form action="${pageContext.request.contextPath}/login" method="post">
            <label class="label" for="email">Email</label>
            <input type="text" name="email" id="email">
            <label class="label" for="password">Password</label>
            <input type="password" name="password" id="password">
            <p class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
            </p>
            <div id="button">
            <button name="submit" type="submit">login</button>
            <button id="reset" type="reset">Reset</button>
            </div>
</form>
<img src="./image/employee2.jpg" alt="image">
</div>
 
</body>
</html>