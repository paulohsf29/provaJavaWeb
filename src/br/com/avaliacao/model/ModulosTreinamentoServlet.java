package br.com.avaliacao.model;




import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import br.com.avaliacao.dao.ConexaoMySqlDAO;
import br.com.avaliacao.dao.ModuloDAO;

@WebServlet("/modulos")
public class ModulosTreinamentoServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ConexaoMySqlDAO conexao = new ConexaoMySqlDAO();
		Connection conn = conexao.obterConexao();
		
		ModuloDAO modulo = new ModuloDAO(conn);
		List <Modulo> listaModulos = modulo.consultarModulos();
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("modulos", listaModulos);
		  
		RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(req, resp);
	}
}