<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login success</title>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.4.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/userList.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.min.js" />" ></script>
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.dataTables.min.css" />" type="text/css" /> 

</head>
<body>
<form:form modelAttribute="loginBean" >
	<h2>${msg}</h2>
	<table width="100%" style="border: solid 1px black; border-collapse: collapse;" id="myTable">
		<thead>
				<tr style="background-color: teal; color:white;">
					<th>No.</th>
					<th>Email</th>
					<th>Password</th>
					<th>First Name</th>
					<th>Last Name</th>
				</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${user.email_id}</td>
					<td>${user.password}</td>
					<td>${user.first_name}</td>
					<td>${user.last_name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>	
	<br/>
</form:form>
</body>
</html>