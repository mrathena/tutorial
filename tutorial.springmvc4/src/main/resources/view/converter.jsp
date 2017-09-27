<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Converter</title>
</head>
<body>
	<input type="button" id="submit" value="Submit" />
	<script src="static/jquery/3.2.1/jquery-3.2.1.min.js"></script>
	<script>
	$(document).ready(function() {
		$(document).on("click", "#submit", function() {
			$.ajax({
				url:"convert",
				data:"1-mrathena",
				type:"post",
				contentType:"application/mrathena",
				success:function(response) {
					alert(response);
				}
			});
		});
	});	
	</script>
</body>
</html>