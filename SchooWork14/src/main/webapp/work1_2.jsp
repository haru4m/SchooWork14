<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>偶数</title>
</head>
<body>
	<%
	for (int i = 0; i <= 10; i++) {
	%>
	<%
	if ((i % 2) == 1) {
	%>
	<B><%=i%>回目の偶数です。</B>
	<br>
	<%
	}
	}
	%>
</body>
</html>
