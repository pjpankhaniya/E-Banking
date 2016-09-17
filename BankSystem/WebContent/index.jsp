
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
	
</script>
<title>Wel-Come To KBC Bank</title>



<link rel="stylesheet" href="css/style.css">




</head>

<body>
	<form action="" method="post">
		<header>Wel-come to KBC Bank<br><u>Login</u></header>
		<label>Username <span>*</span></label> <input type="text" name="username"/>
		<div class="help">At least 6 character</div>
		<label>Password <span>*</span></label> <input type="password" name="password" />
		
		<div class="help">Use upper and lowercase lettes as well</div>
		<button formaction="Login">Login</button>
		<button formaction="Register.jsp">Register</button>
		<header><font color="red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
		</font></header>
	</form>
	
</body>
</html>
