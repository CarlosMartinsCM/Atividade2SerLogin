<%@page import="app.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
	<h1>Bem vindo: <%=usuario%></h1><br>
	<a href="logout" class="botao2"> Logout </a>
	<a href="verificaLogin.jsp" class="botao">Status</a>
</body>
</html>










