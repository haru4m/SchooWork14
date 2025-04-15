<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.DateFormat"%>


<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>表示ページ</title>
</head>
<body>

	<h1>Display Date</h1>
	<p>現在時刻は</p>
	<p><B><%=request.getAttribute("now") %></B></p>
</body>
</html>