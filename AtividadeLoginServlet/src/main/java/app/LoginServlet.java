package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("field_name");
		String senha = req.getParameter("field_senha");
		
		Usuario usu = verificaLogin(email, senha);

		if (usu != null) {

			HttpSession sessao = req.getSession(true); // Se a sessao não existe ele cria uma nova

			sessao.setAttribute("usuario", usu);
			sessao.setAttribute("esta_logado", true);

			resp.sendRedirect("index.jsp");

		} else {
			req.getSession().invalidate();
			resp.sendRedirect("login.jsp");
		}
	}

	public Usuario verificaLogin(String email, String senha) {
		
		Usuario usu1 = new Usuario("admin", "admin");
	
		
		List<Usuario> bancoDados = new ArrayList<>();
		bancoDados.add(usu1);
		
		
		Usuario usuarioLogin = new Usuario(email, senha);
		
		if(bancoDados.contains(usuarioLogin)) {
			return usuarioLogin;
		} else {
			return null;
		}
	}
}

/*
 * HttpSession sessao = req.getSession(false); Se a sessao não existe retorna
 * nulo. Estratégia para login String email = "carlostenzel@gmail.com"; // Cria
 * login, cria sessao, parametros digitados na mão. String senha = "12345";
 */
