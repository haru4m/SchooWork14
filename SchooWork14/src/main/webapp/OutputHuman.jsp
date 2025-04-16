<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="model.Human" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HUMANアウトプット</title>
</head>
<body>

<	<%@Human human;
		human = (Human)request.getAttribute("human");%>

	<p>入力された情報は以下です。</p>
	<P>
		名前：<%=human.getName()%></P>
	<p>
		年齢：<%=human.getAge()%></p>


</body>
</html>