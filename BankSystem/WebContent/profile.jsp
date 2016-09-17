<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	if (request.getSession().getAttribute("name") == null) {
		response.sendRedirect("index.jsp");
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>KBC User Profile</title>
<script type="text/javascript">
	
</script>
<style>
.flex-container {
	display: -webkit-flex;
	display: flex;
	-webkit-flex-flow: row wrap;
	flex-flow: row wrap;
	text-align: center;
}

.flex-container>* {
	padding: 15px;
	-webkit-flex: 1 100%;
	flex: 1 100%;
}

.article {
	text-align: left;
}

header {
	background: black;
	color: white;
}

footer {
	background: #aaa;
	color: white;
}

.nav {
	background: white;
}

.nav ul {
	list-style-type: none;
	padding: 0;
}

.nav ul a {
	text-decoration: none;
}

@media all and (min-width: 768px) {
	.nav {
		text-align: left;
		-webkit-flex: 1 auto;
		flex: 1 auto;
		-webkit-order: 1;
		order: 1;
	}
	.article {
		-webkit-flex: 5 0px;
		flex: 5 0px;
		-webkit-order: 2;
		order: 2;
	}
	footer {
		-webkit-order: 3;
		order: 3;
	}
}

.menu {
	margin-top: 80px;
	z-index: 0
}

.h1 {
	text-align: center;
	margin-top: 50px;
	color: highlight;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 16px;
	text-decoration: none;
}

.logout {
	float: right;
	text-align: right:
}

li a:hover {
	background-color: #111111;
}

.login {
	position: absolute;
	top: calc(50% - 75px);
	left: calc(50% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text] {
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid black;
	border-radius: 2px;
	color: black;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}


</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.js"></script>
</head>
<body>

	<h1 class="h1">
		WEL-COME,KBC BANK <br>
		<script>
			document.write(Date());
		</script>
	</h1>
	<div class="menu">
		<ul id="dd">
			<li id="l1"><a href="home">Home</a></li>
			<li id="l1"><a href="TS">Transfer Money</a></li>
			<li id="l1"><a href="Download">Download</a></li>

			<li id="l1"><a href="Password">Password change</a></li>
			<li id="l1"><a href="contact">Contact</a></li>
			<li id="l1"><a href="About">About</a></li>
			<li class="logout"><a
				href="${pageContext.request.contextPath}/Logout">LogOut</a></li>
			<%-- ${pageContext.request.contextPath}/--%>
		</ul>


	</div>
	
	<div id="content">
	</div>
	
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="home.js"></script>
</body>
</html>