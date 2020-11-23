<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add details</title>
<link type="text/css" rel="stylesheet" href="./style/Adddesign.css">
</head>
<body>
<nav>
<ul>
  <li><h2>Employee Management</h2></li>
  <li><a href="${pageContext.request.contextPath}/emp"><h3>Back</h3></a></li>
</ul>
</nav>
<h1>add details</h1>
<h3>${message}</h3>
<div class="form-design"> 
<form action="${pageContext.request.contextPath}/Add" method="post">
            <label class="lable" for="First-name">First Name</label>
            <input type="text" name="firstname" id="firstname">
            <label class="label" for="lastname">Last Name</label>
            <input type="text" name="lastname" id="lastname">
            <label class="label" for="Fathername">Father name</label>
            <input type="text" name="fathername" id="fathername">
            <label class="label" for="mothername">Mother name</label>
            <input type="text" name="mothername" id="mothername">
            <label class="label" for="dob">DOB</label>
            <input type="text" name="dob" id="dob">
            <label class="label" for="email">Email</label>
            <input type="text" name="email" id="email">
            <label class="label" for="password">Password</label>
            <input type="password" name="password" id="password">
            <p class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter
            </p>
            <label class="label" for="mobile">Mobile</label>
            <input type="text" name="mobile" id="mobile">
            <label class="label" for="Gender">Gender</label>
              <select name="gender" id="gender">
				    <option value="female">Female</option>
				    <option value="male">Male</option>
			 </select>
            <label class="label" for="education">Education</label>
            <input type="text" name="education" id="education">
            <label class="label" for="address">Address</label>
            <input type="text" name="address" id="address">
            <div id="button">
            <button name="submit" type="submit">add</button>
            <button id="reset" type="reset">Reset</button>
            </div>
</form>
</div>
</body>
</html>