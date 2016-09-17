
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
<title>Admin Profile</title>
</head>

<frameset rows="20%,*">
	<frame src="top.jsp" name="top_frame">
	<frameset cols="205,*">
		<frame src="side.jsp" name="side_page">
		<frame src="mid.jsp" name="mid_page">
	</frameset>
</frameset>
</html>