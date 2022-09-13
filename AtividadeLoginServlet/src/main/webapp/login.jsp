<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		<label>Nome</label>
			<input type="text" name="field_name" /><br>
		<label>Senha</label>
			<input type="text" name="field_senha" /><br><br>
		<input type="submit" class="login" />
		<a href="verificaLogin.jsp" class="botao">Status</a>
	</form>
</body>
</html>