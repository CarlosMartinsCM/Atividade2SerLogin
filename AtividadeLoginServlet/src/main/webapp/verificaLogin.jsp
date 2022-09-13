<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="app.Usuario"%>
<%
Usuario usuario = (Usuario) session.getAttribute("usuario");

Boolean estalogado = (Boolean) session.getAttribute("esta_logado");

if (estalogado == null || estalogado == false) {

	response.sendRedirect("login.jsp");

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atividade login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>
		Logado como:
		<%=usuario%>
	</h1>
	<a href="logout" class="botao2"> Logout </a>
	<a href="index.jsp" class="botao">Main</a>
</body>
</html>