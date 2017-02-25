<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List user</title>
<%@ include file="/WEB-INF/views/common.jsp" %>
<script type="text/javascript" src="<c:url value="/resources/js/userList.js" />" ></script>
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.dataTables.min.css" />" type="text/css" /> 
<script type="text/javascript" src="<c:url value="/resources/js/registerUser.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />" ></script>
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/css/materialize.min.css"> -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.2/js/materialize.min.js"></script>
<%-- <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" type="text/css" /> --%>
<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />" type="text/css" />
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="<c:url value="/resources/css/registerUser.css" />" type="text/css" /> 

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
	      <a class="navbar-brand" href="#">Spring Project</a>
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
			<h2>Information User</h2>
			<table id="myTable" class="display" style="border:1px solid #d8f0e0;">
				<thead>
						<tr style="background-color: #22b1c4;">
							<th>No.</th>
							<th>Email</th>
							<th>Password</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Status</th>
						</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList}" var="user" varStatus="status">
						<tr>
							<td id="count">${status.count}</td>
							<td id="email_id">${user.email_id}</td>
							<td id="password">${user.password}</td>
							<td id="first_name">${user.first_name}</td>
							<td id="last_name">${user.last_name}</td>
							<c:choose>
								<c:when test="${empty user.status}">
									<td id="status">Disallow</td>
								</c:when>
								<c:otherwise>
									<c:if test="${user.status == '0' }">
										<td id="status">Disallow</td>
									</c:if>
									<c:if test="${user.status == '1' }">
										<td id="status">Allow</td>
									</c:if>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>	
			<br/>
		</form:form>
<!-- Pop-up when double click to row of table  -->
<div class="modal fade" id="detail-user">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header" style="background-color: #daf1f6 !important;">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Detail user</h4>
      </div>
      <div class="modal-body">
        <table>
        	<tr>
        		<td class="detail-user-label"><span>No.</span></td>
        		<td class="detail-user-info"><span id="detail-count"></span></td>
        	</tr>
        	<tr>
        		<td class="detail-user-label"><span>Email</span></td>
        		<td class="detail-user-info"><span id="detail-email_id"></span></td>
        	</tr>
        	<tr><td class="detail-user-label"><span>Password</span></td>
        		<td class="detail-user-info"><span id="detail-password"></span></td>
        	</tr>
        	<tr>
        		<td class="detail-user-label"><span>First name</span></td>
        		<td class="detail-user-info"><span id="detail-first_name"></span></td>
        	</tr>
        	<tr>
        		<td class="detail-user-label"><span>Last name</span></td>
        		<td class="detail-user-info"><span id="detail-last_name"></span></td>
        	</tr>
        	<tr>
        		<td class="detail-user-label"><span>Status</span></td>
        		<td class="detail-user-info"><span id="detail-status"></span></td>
        	</tr>
        </table>
      </div>
      <div class="modal-footer" style="background-color: #f5f5f5 !important;">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

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
<!-- 								    	<span class="help-block has-error" id="password-error"></span> -->
								    	<div id="password-error"></div>
								  	</div>
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">Email</i></div>
								      		<input type="text" class="form-control" id="email" placeholder="Email" name="email_id">
								    	</div>
								    	<span class="help-block has-error" id="email-Id"></span>
								  	</div>								  	
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">First name</i></div>
								      		<input type="text" class="form-control" id="firstName" placeholder="First name" name="first_name">
								    	</div>
								    	<span class="help-block has-error" id="first-Name"></span>
								  	</div>	
								  	
								  	<div class="form-group">
								    	<div class="input-group">
								      		<div class="input-group-addon">Last name</i></div>
								      		<input type="text" class="form-control" id="lastName" placeholder="Last name" name="last_name">
								    	</div>
								    	<span class="help-block has-error" id="last-Name"></span>
								  	</div>									  	

						  			<button type=button id="regist_btn" class="btn btn-block btn-primary" data-loading-text="Signing In...." onclick="btn_regist();">Register</button>
						  			<div class="clearfix"></div>
						  			<div class="login-modal-footer">
						  				<div class="row">
											<div class="col-xs-8 col-sm-8 col-md-8">
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4">
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