package avaliacao.service;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import avaliacao.dao.ConexaoMySqlDAO;
import avaliacao.dao.ModuloDAO;
import avaliacao.Modulo;

public class ModuloService {


public List<Modulo> listarModulos(){
	ConexaoMySqlDAO conexaoMySql = new ConexaoMySqlDAO();
	Connection conn = null;
	try {
		conn = conexaoMySql.obterConexao();
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	
	ModuloDAO moduloDAO = new ModuloDAO(conn);
	List<Modulo> listaModulos = moduloDAO.consultarModulos();
	
	try {
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return listaModulos;
}

}