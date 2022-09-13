package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Cadastro;
import javax.servlet.RequestDispatcher;

@WebServlet("/processar")
public class ProcessarFormulario extends HttpServlet {

	private static final long serialVersionUID = 9053399214504763616L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome = req.getParameter("field_nome");
		String dataStr = req.getParameter("field_data");
		String idioma = req.getParameter("field_idioma");

		String[] habilidades = req.getParameterValues("habTecnicas");

		try {

			Cadastro cadastro = new Cadastro();

			cadastro.setNome(nome);
			cadastro.setDataNascimento(dataStr);
			cadastro.setIdioma(idioma);
			cadastro.setHabilidades(habilidades);

		} catch (Exception e) {

			req.setAttribute("erro", e.getMessage());

			RequestDispatcher dispatcher = req.getRequestDispatcher("formulario.jsp");
			dispatcher.forward(req, resp);

			resp.getWriter().println(e.getMessage());
		}

		System.out.println(dataStr);

		PrintWriter out = resp.getWriter();

		out.println("Nome: " + nome);
		out.println("Data nascimento: " + dataStr);
		out.println("Idioma nativo: " + idioma);
		out.println("Habilidades");
		for (int i = 0; i < habilidades.length; i++) {
			out.println(habilidades[i]);
		}
	}
}
