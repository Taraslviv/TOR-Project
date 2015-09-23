/**
 * 
 */
$('#take-user-info').click(function(){
	

	var json = {
			'firstName' : $('#firstName').val(),
			'lastName' : $('#lastName').val(),
			'middleName' : $('#middleName').val(),
			'age' : $('#age').val(),
			'eMail' : $('#eMail').val(),
			'userPassword' : $('#userPassword').val(),
			'userRole' : $('#userRole').val(),
	}
	
	$.ajax({
		
//	    headers: { 
//	        'Accept': "application/json",
//	        'Content-Type': "application/json" 
//	    },
//	     beforeSend : function(xhr) {
//	         xhr.setRequestHeader("Accept", "application/json");
//	         xhr.setRequestHeader("Content-Type", "application/json");
//	      },
		
		url : "editUserInfo",
		type : "POST",
		data : JSON.stringify(json),
		contextType : "application/json",
		success : function() {
			console.log("OK");
		},
		error: function() {
			console.log("Not OK");
		}
	});
	
	console.log("OK script");
});