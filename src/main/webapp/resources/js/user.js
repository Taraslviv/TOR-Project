/**
 * 
 */
$('#take-user-info').click(function(){
	
	var r = confirm("Do you want save changes?");
	if (r == true) {
		//window.location = 'home';
		
		//prompt("Change has been saved")

	var json = {
			'firstName' : $('#firstName').val(),
			'lastName' : $('#lastName').val(),
			'middleName' : $('#middleName').val(),
			'age' : $('#age').val(),
			'eMail' : $('#eMail').val(),
			'id' : $('#id').val()
			//'userPassword' : $('#userPassword').val(),
			//'userRole' : $('#userRole').val()
	}
	
	$.ajax({
		
		url : "editUserInfo",
		type : "POST",
		data : JSON.stringify(json),
		contentType : "application/json",
		//dataType : "json",
		success : function() {
			console.log("OK");
			//window.location = 'home';
			//window.location.href = "home";
			alert("Change has been saved");
		},
		//error(jqXHR, textStatus, errorThrown):function,array
		error:function(XMLHttpRequest, textStatus, errorThrown) {
			console.log("We have next errors:"+XMLHttpRequest, textStatus, errorThrown);
			alert("Change hasn't been saved");
		}

	});
	} else {
	    
	}
});
