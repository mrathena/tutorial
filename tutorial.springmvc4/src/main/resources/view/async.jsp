<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PUSH ASYNC</title>
</head>
<body>
	<script src='<c:url value="static/jquery/3.2.1/jquery-3.2.1.min.js" />'></script>
	<script>
	deferred();
	function deferred() {
		$.get("defer", function(response) {
			console.log("Response: " + response);
			deferred();
		});
	}
	</script>
</body>
</html>