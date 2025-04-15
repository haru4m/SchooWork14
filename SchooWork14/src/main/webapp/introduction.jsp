<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>私の自己紹介</title>
</head>
<body>
	<h1>私の自己紹介</h1>
	<dl>
	<% 
	for(int i = 0 ; i<5; i++){ %>
		<dt>名前<%=i  %></dt>
		<%} %>
		<dd>春口</dd>
		<dt>年齢</dt>
		<dd>38</dd>
		<dt>趣味</dt>
		<dd>サッカー</dd>
	</dl>
</body>
</html>