package avaliacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import avaliacao.Modulo;

public class ModuloDAO {
	Connection conn;
	
	
	private String SQL_LISTAR_TODAS = "select ds_nome, ds_instrutor_titular, ds_instrutor_auxiliar,dt_inicio from tb_modulo";
	
	public ModuloDAO(Connection conn) {
		this.conn = conn;
	}
	
	public List<Modulo> consultarModulos(){
		
		List<Modulo> listaModulos = new ArrayList();
		
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL_LISTAR_TODAS);) {
			
			while (rs.next()) {
				Modulo modulo = new Modulo();
				modulo.setNome(rs.getString("ds_nome"));
				modulo.setInstrutorTitular(rs.getString("ds_instrutor_titular"));
				modulo.setInstrutorAuxiliar(rs.getString("ds_instrutor_auxiliar"));
				modulo.setDataInicio(rs.getDate("dt_inicio"));
				
				
				listaModulos.add(modulo);
			}
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return listaModulos;
		
	}
	
}
