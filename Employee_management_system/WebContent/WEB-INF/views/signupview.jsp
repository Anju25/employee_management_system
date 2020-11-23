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
<div class="form-design"> 
<form action="${pageContext.request.contextPath}/Signup" method="post">
             ${message} 
            <label class="label" for="email">Email</label>
            <input type="text" name="email" id="email">
            <label class="label" for="password">Password</label>
            <input type="password" name="password" id="password">
            <p>Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
            </p>
            <label class="label" for="password">Confirm Password</label>
            <input type="password" name="confirmPassword" id="confirmpassword">
            
            <div id="button">
            <button name="submit" type="submit">Sign In</button>
            <button id="reset" type="reset">Reset</button>
            </div>
</form>
<img src="./image/signup.png" alt="image">
</div>
 
</body>
</html>