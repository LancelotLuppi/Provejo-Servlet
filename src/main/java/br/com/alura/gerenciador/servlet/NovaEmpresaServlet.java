package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = req.getParameter("nome");
		
		Empresa empresa = new Empresa(nomeEmpresa);
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// Chamando JSP
		RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCadastrada.jsp");
		
		// Atribuindo o nome da empresa ao request
		req.setAttribute("empresa", empresa.getNome());
		
		// Lan�ando o Request para o JSP
		rd.forward(req, resp);
	}

}
