/**
 * 
 */
package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author marcos
 *
 */
public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sessao = request.getSession();

		// sessao.removeAttribute("usuarioLogado");
		sessao.invalidate();
		
		return "redirect:entrada?acao=LoginForm";
	}

}
