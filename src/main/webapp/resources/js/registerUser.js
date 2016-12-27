$(document).ready(function(){
	$(document).on('click','.signup-tab',function(e){
		e.preventDefault();
	    $('#signup-taba').tab('show');
	});	
	
	$(document).on('click','.signin-tab',function(e){
	   	e.preventDefault();
	    $('#signin-taba').tab('show');
	});
	    	
//	$(document).on('click','#regist_btn',function(e){
//	 	e.preventDefault();
//	 	var data = $("#form_regist").serialize();
//	 	alert(data);
//	 	$.ajax({
//	 		type: "POST",
//	 		data: JSON.stringify(data),
//	 		url: "/Spring-MVC-LoginForm/registUser/regist",
//	 		async: false,
//	 		dataType: "json",
//	 		success: function (){
//	 			alert("OK");
//	 		}
//	 	});
//	});
});	