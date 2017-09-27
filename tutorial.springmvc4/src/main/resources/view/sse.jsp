<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PUSH SSE</title>
</head>
<body>
	<div id="msgFormpPush"></div>
	<script src='<c:url value="static/jquery/3.2.1/jquery-3.2.1.min.js" />'></script>
	<script>
	// EventSource对象只有新式浏览器才支持(Chrome,Firefox等), EventSource是SSE的客户端
	if (!!window.EventSource) {
		var source = new EventSource('push');
		// 添加SSE客户端监听, 在此获得服务器端推送的消息
		source.addEventListener('message', function(e) {
			$("#msgFormpPush").html(e.data);
		});
		source.addEventListener('open', function(e) {
			console.log("连接打开");
		}, false);
		source.addEventListener('error', function(e) {
			if (e.readyState == EventSource.CLOSED) {
				console.log("连接关闭");
			} else {
				console.log(e.readyState);
			}
		}, false);
	} else {
		console.log("浏览器不支持SSE");
	}
	</script>
</body>
</html>