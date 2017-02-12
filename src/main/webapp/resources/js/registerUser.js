$(document).ready(function(){
	$(document).on('click','.signup-tab',function(e){
		e.preventDefault();
	    $('#signup-taba').tab('show');
	});	
	
	$(document).on('click','.signin-tab',function(e){
	   	e.preventDefault();
	    $('#signin-taba').tab('show');
	});
});	

function btn_regist() {
//	 	var email_id = $("#email").val();
//	 	var password = $("#password").val();
//	 	var lastName = $("#lastName").val();
//	 	var first_name = $("#first_name").val();
//	 	var jsonData = {"email_id" : email_id, "password" : password,"lastName" : lastName,"first_name" : first_name};
	 	var data = $("#form_regist").serialize();
	 	$.ajax({
	 		data: data,
	 		type: 'POST',
	 		url: "/Spring-MVC-LoginForm/registUser/regist/",
	 		async: false,
			dataType : 'json',
			timeout : 100000,
	 		success: function (response){
	 			try {
	 				var strResponse = jQuery.parseJSON(response);
	 			} catch(err) {}
	 			if (response.hasError == 'false') {
	 				$("#email-Id").css('display', 'none');
	 				$("#password-error").css('display', 'none');
	 				$("#first-Name").css('display', 'none');
	 			} else {
	 				// Display error message for password
	 				if ($.trim(response.passwordError)) {
	 					$("#password-error").html(response.passwordError);
	 					$("#password-error").css('display', 'inline');
	 				} else {
	 					$("#password-error").html("");
	 				}
	 				// Display error message for email
	 				if ($.trim(response.emailError)) {
	 					$("#email-Id").html(response.emailError);
	 					$("#email-Id").css('display', 'inline');	
	 				} else {
	 					$("#email-Id").html("");
	 				}
	 				
	 				// Display error message for email
	 				if ($.trim(response.firstNameError)) {
	 					$("#first-Name").html(response.firstNameError);
	 					$("#first-Name").css('display', 'inline');	
	 				} else {
	 					$("#first-Name").html("");
	 				}
	 			}
	 		}
	 });
}