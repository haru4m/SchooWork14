<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>送信完了</h1>
<p>入力された文字は</p>
<%=request.getAttribute("name2") %>
<p>リクエストを受け付けました</p>
</body>
</html>