package br.com.avaliacao.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.avaliacao.model.Modulo;

public class ModuloDAO {
	Connection conn;
//	Modulo modulo1 = new Modulo("NIVELAMENTO", "Ivo", "Leo", "20/06/2020");
//	Modulo modulo2 = new Modulo("HTML/CSS", "Jonas", "Leo", "27/06/2020");
//	Modulo modulo3 = new Modulo("JAVASCRIPT", "Jonas", "Leo", "02/07/2020");
//	Modulo modulo4 = new Modulo("POO", "Ivo", "Leo", "11/07/2020");
//	Modulo modulo5 = new Modulo("JAVA", "Leo", "Ivo", "18/07/2020");
//	Modulo modulo6 = new Modulo("BD", "Leo", "Fabio", "24/07/2020");
//	Modulo modulo7 = new Modulo("Aplicação Web", "Fabio", "Ivo", "30/07/2020");
//	Modulo modulo8 = new Modulo("Spring Boot", "Fabio", "Ivo", "05/08/2020");
//	Modulo modulo9 = new Modulo("Angular", "Jonas", "Fabio", "13/08/2020");
	
	public ModuloDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	public List<Modulo> consultarModulos(){
		
//		List<Modulo> listaModulos = new ArrayList();
//		listaModulos.add(modulo1);
//		listaModulos.add(modulo2);
//		listaModulos.add(modulo3);
//		listaModulos.add(modulo4);
//		listaModulos.add(modulo5);
//		listaModulos.add(modulo6);
//		listaModulos.add(modulo7);
//		listaModulos.add(modulo8);
//		listaModulos.add(modulo9);
		
		return listaModulos;
	}
}
