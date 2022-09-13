<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String erro = (String) request.getAttribute("erro");
	%>

	<%
		if (erro != null) {
	%>
	<p>
		<%
			out.println(erro);
		%>
	</p>
	<%
		}
	%>

	<form method="post" action="processar">
		<label>Nome</label> <input type="text" name="field_nome" value=""
			placeholder="Digite seu nome" autofocus="autofocus" /> <br>
		<br> <label>Data de nascimento:</label> <input type="date"
			name="field_data" /> <br>
		<br> <label>Idioma Nativo</label> <select name="field_idioma">
			<option value="Portugues">Portugues</option>
			<option value="Ingles">Ingles</option>
			<option value="Espanhol">Espanhol</option>
		</select><br>
		<br> <label>Habilidades técnicas</label><br> <span> <input
			type="checkbox" name="habTecnicas" value="Java"> <label>Java</label>
		</span> <br> <input type="checkbox" name="habTecnicas"
			value="JavaScript"> <label>JavaScript</label> <br> <input
			type="checkbox" name="habTecnicas" value="HTML"> <label>HTML</label>
		<br> <input type="checkbox" name="habTecnicas" value="CSS">
		<label>CSS</label><br> <input type="submit" value="Enviar">
	</form>

</body>
</html>