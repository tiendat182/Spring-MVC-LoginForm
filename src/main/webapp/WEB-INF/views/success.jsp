<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/common.jsp" %>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
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
	        <li class="active"><a href="#">Home</a></li>
	        <li class="dropdown">
	          <a class="dropdown-toggle" data-toggle="dropdown" href="#">User <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">Home</a></li>
	            <li><a href="${pageContext.request.contextPath}/registUser/getUserList">User Info</a></li>
	            <li><a href="#">Contact</a></li>
	          </ul>
	        </li>
	        <li><a href="#">Map</a></li>
	        <li><a href="#">About</a></li>
	      </ul>
	      
      	  <form class="navbar-form navbar-left">
		      <div class="input-group">
		        <input type="text" class="form-control" placeholder="Search">
		        <div class="input-group-btn">
		          <button class="btn btn-default" type="submit">
		            <i class="glyphicon glyphicon-search"></i>
		          </button>
		        </div>
		      </div>
	    </form>
			  
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
	<h5>${msg}</h5>
	<p>In this example, we create a "user" with the information of that user. Please to click to "User Info" tab to create.</p>
	<p> </p>
	<div class="col-md-10 col-md-offset-1">

            <div class="panel panel-default panel-table">
              <div class="panel-heading">
                <div class="row">
                  <div class="col col-xs-6">
                    <h3 class="panel-title">Car Information</h3>
                  </div>
                  <div class="col col-xs-6 text-right">
                  Filter:
		            <select id="filter-date" name="" class="selectpicker" data-style="btn-primary" data-live-search="true">
		                <option value="">Past date</option>
		                <option value="">Curent date</option>
		                <option value="">Future date</option>
					</select>
                  </div>
                </div>
              </div>
              <div class="panel-body">
                <table class="table table-striped table-bordered table-list">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em></th>
                        <th class="hidden-xs">ID</th>
                        <th>Name</th>
                        <th>Email</th>
                    </tr> 
                  </thead>
                  <tbody>
                          <tr>
                            <td align="center">
                              <a class="btn btn-default"><em class="fa fa-pencil"></em></a>
                              <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
                            </td>
                            <td class="hidden-xs">1</td>
                            <td>John Doe</td>
                            <td>johndoe@example.com</td>
                          </tr>
                        </tbody>
                </table>
            
              </div>
              <div class="panel-footer">
                <div class="row">
                  <div class="col col-xs-4">Page 1 of 5
                  </div>
                  <div class="col col-xs-8">
                    <ul class="pagination hidden-xs pull-right">
                      <li><a href="#">1</a></li>
                      <li><a href="#">2</a></li>
                      <li><a href="#">3</a></li>
                      <li><a href="#">4</a></li>
                      <li><a href="#">5</a></li>
                    </ul>
                    <ul class="pagination visible-xs pull-right">
                        <li><a href="#">«</a></li>
                        <li><a href="#">»</a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
	</div></div>

</body>
</html>