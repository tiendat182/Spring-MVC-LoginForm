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
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.dataTables.min.css" />" type="text/css" /> 
<link rel="stylesheet" href="<c:url value="/resources/css/registerUser.css" />" type="text/css" /> 
<script type="text/javascript" src="<c:url value="/resources/js/registerUser.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.min.js" />" ></script>
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/css/materialize.min.css"> -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/js/materialize.min.js"></script>
<%-- <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" type="text/css" /> --%>
<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />" type="text/css" />
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />" ></script>

</head>
<body style="margin: auto;width: 80%;">

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>                        
	      </button>
	      <a class="navbar-brand" href="#">XMS Project</a>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="${pageContext.request.contextPath}/login">Login</a></li>
	        <li class="dropdown">
	          <a class="dropdown-toggle" data-toggle="dropdown" href="#">User <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="javascript:history.back()">Back</a></li>
	            <li><a href="${pageContext.request.contextPath}/registUser/getUserList">User Info</a></li>
	            <li><a href="#">Contact</a></li>
	          </ul>
	        </li>
	        <li><a href="#">Map</a></li>
	        <li><a href="#">About</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div style="border: 1px solid rgb(169, 169, 169); padding: 50px;" id="wrapper">
		<form:form modelAttribute="userBean" >
			<h2>User Information</h2>
			<table id="myTable" class="display">
				<thead>
						<tr>
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

<!-- Popup -->
	<div style="float: right;">
		<a class="btn btn-primary" href="javascript:;" data-toggle="modal" data-target="#addUserModal">New user</a>
		<a class="btn btn-primary" href="javascript:;" data-toggle="modal" data-target="#editUserModal">Edit user</a>
		<a class="btn btn-primary" href="javascript:;" data-toggle="modal" data-target="#deleteUserModal">Delete user</a>
	</div>
	<div class="modal fade" id="addUserModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel" aria-hidden="true">
	<div class="modal-dialog">
    	<div class="modal-content login-modal">
      		<div class="modal-header login-modal-header">
        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        		<h4 class="modal-title text-center" id="loginModalLabel">Add new user</h4>
      		</div>
      		<div class="modal-body">
      			<div class="text-center">
	      			<div role="tabpanel" class="login-tab">
					  	<!-- Nav tabs -->
					  	<ul class="nav nav-tabs" role="tablist">
					    	<li role="presentation" class="active"><a id="signin-taba" href="#home" aria-controls="home" role="tab" data-toggle="tab">Create user</a></li>
					    	<li role="presentation"><a id="signup-taba" href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Sign Up</a></li>
					  	</ul>
					
					  	<!-- Tab panes -->
					 	<div class="tab-content">
					 	<!-- Register form -->
					    	<div role="tabpanel" class="tab-pane active text-center" id="home">
					    		&nbsp;&nbsp;
					    		<span id="login_fail" class="response_error" style="display: none;">Loggin failed, please try again.</span>
					    		<div class="clearfix"></div>
					    		<form:form method="POST" action="${pageContext.request.contextPath}/registUser/regist" id="form_regist" modelAttribute="userBean">
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">Password</div>
								      		<input type="password" class="form-control" id="password" placeholder="Password" name="password">
								    	</div>
								    	<span class="help-block has-error" id="password-error"></span>
								  	</div>
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">Email</i></div>
								      		<input type="text" class="form-control" id="email" placeholder="Email" name="email_id">
								    	</div>
								    	<span class="help-block has-error" id="email-error"></span>
								  	</div>								  	
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">Last name</i></div>
								      		<input type="text" class="form-control" id="lastName" placeholder="Last name" name="last_name">
								    	</div>
								    	<span class="help-block has-error" id="lastName-error"></span>
								  	</div>									  	
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">First name</i></div>
								      		<input type="text" class="form-control" id="firstName" placeholder="First name" name="first_name">
								    	</div>
								    	<span class="help-block has-error" id="firstName-error"></span>
								  	</div>									  	
								  	
						  			<button type="submit" id="regist_btn" class="btn btn-block btn-primary" data-loading-text="Signing In....">Register</button>
						  			<div class="clearfix"></div>
						  			<div class="login-modal-footer">
						  				<div class="row">
											<div class="col-xs-8 col-sm-8 col-md-8">
												<i class="fa fa-lock"></i>
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4">
												<i class="fa fa-check"></i>
											</div>
										</div>
						  			</div>
								</form:form>
					    	</div>
					    	
					    	<!-- Sign up -->
					    	<div role="tabpanel" class="tab-pane" id="profile">
					    	    &nbsp;&nbsp;
					    	    <span id="registration_fail" class="response_error" style="display: none;">Registration failed, please try again.</span>
					    		<div class="clearfix"></div>
					    		<form>
									<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon"><i class="fa fa-user"></i></div>
								      		<input type="text" class="form-control" id="username" placeholder="Username">
								    	</div>
								    	<span class="help-block has-error" data-error='0' id="username-error"></span>
								  	</div>
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon"><i class="fa fa-at"></i></div>
								      		<input type="text" class="form-control" id="remail" placeholder="Email">
								    	</div>
								    	<span class="help-block has-error" data-error='0' id="remail-error"></span>
								  	</div>
						  			<button type="button" id="register_btn" class="btn btn-block bt-login" data-loading-text="Registering....">Register</button>
									<div class="clearfix"></div>
									<div class="login-modal-footer">
						  				<div class="row">
											<div class="col-xs-8 col-sm-8 col-md-8">
												<i class="fa fa-lock"></i>
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4">
												<i class="fa fa-check"></i>
											</div>
										</div>
						  			</div>
								</form>
					    	</div>
						  	</div>
						</div>
	      				
	      			</div>
	      		</div>
	      		
	    	</div>
	   </div>
 	</div>
 	<!-- - Login Model Ends Here -->

</div><!-- End #wrapper -->
</body>
</html>