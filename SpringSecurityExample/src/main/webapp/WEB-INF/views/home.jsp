<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h2><a href="/spring_security_login">Local Login</a></h2>
<h2><a href="/facebook_login">Facebook Login</a></h2>
<hr/>
<h3>username : <sec:authentication property="principal" /></h3> 
<h3>details : <sec:authentication property="details" /></h3> 
<hr/>
<h2><a href="/logout">Logout</a></h2>
<h1>
	Hello world!  
</h1>
<ul>
	<li><a href="member/">member</a></li>
	<li><a href="school/">school</a></li>
</ul>
</body>
</html>
