<%@page import="java.io.Writer"%>
<%@page import="java.sql.ResultSet"%>
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.table {
	text-align: center;
	font-size: 20px;
	border-collapse: collapse;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue" class="table">

	<div  align="center">
		
	
	<c:if test="${fn:length(rs) > 0}">


			<TABLE BORDER="1">
				<TR>
					<TH>Name</TH>
					<TH>UserName</TH>
					<th>Email</th>
					
					<TH>Mobile1</TH>
					<TH>Mobile2</TH>
					<TH>Gender</TH>
					<th>Date Of Birth </th>
					<TH>Status</TH>
				</TR>
	 
				<c:forEach items="${rs}" var="rs">
					<tr>
						<td><c:out value="${rs.name}" /></td>
						<td><c:out value="${rs.username}" /></td>
						<td><c:out value="${rs.email}" /></td>
						<td><c:out value="${rs.mobile1}" /></td>
						<td><c:out value="${rs.mobile2}" /></td>
						<td><c:out value="${rs.gender}" /></td>						
						<td><c:out value="${rs.BOD}" /></td>
						<td><a  href="<c:url value="Approv"><c:param name="username" value="${rs.username}" /></c:url>"  ><c:out value="${rs.status}" /></a></td>
					</tr>
				</c:forEach>
			</TABLE>
			
		</c:if>
		<%
			if( request.getAttribute("msg")!=null){ %>
				<%= request.getAttribute("msg") %>
		<%		}
		%>
		<c:if test="${fn:length(rs1) > 0}">


			<TABLE BORDER="1">
				<TR>
					<TH>Name</TH>
					<TH>UserName</TH>
				</TR>
	 
				<c:forEach items="${rs1}" var="rs">
					<tr>
						<td><c:out value="${rs.name}" /></td>
						<td><c:out value="${rs.username}" /></td>
					</tr>
				</c:forEach>
			</TABLE>
		</c:if>
	</div>
</body>
</html>