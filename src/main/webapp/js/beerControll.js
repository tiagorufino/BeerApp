/**
 * 
 */
function bringBeer(){
	
	$.ajax({
	    type: "GET",
	    contentType: "application/json; charset=utf-8",
	    dataType: "json",
	    url: 'http://localhost:8080/BeerApp/rest/service/randomBeer',
	    success: function (data) {
	    	$('#alcohol').html(data.alcohol);
	    	$('#breweryLocation').html(data.breweryLocation);
	    	$('#description').html(data.description);
	    	$('#name').html(data.name);
	    },
	    error: function (xhr) {
	        SecurityControl.trataError(xhr);
	    }
	})
}
