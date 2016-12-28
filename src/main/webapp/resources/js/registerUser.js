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
	 				$("#password-error").css('display', 'none');
	 			} else {
	 				if ($.trim(response.passwordError)) {
	 					$("#password-error").html(response.passwordError);
	 					$("#password-error").css('display', 'inline');
	 				}
	 			}
	 		}
	 });
}