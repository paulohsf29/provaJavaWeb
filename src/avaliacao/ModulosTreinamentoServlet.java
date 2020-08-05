package avaliacao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import avaliacao.dao.ModuloDAO;
import avaliacao.service.ModuloService;
import avaliacao.Modulo;

@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ModuloService service = new ModuloService();
		
		List<Modulo> listaModulos = service.listarModulos();
		req.setAttribute("modulos", listaModulos);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(req, resp);
	}
	
}
