package br.com.avaliacao.model;

import java.util.Date;

public class Modulo {
	
	private String descNome;
	private String descInstrutorTitular;
	private String descInstrutorAuxiliar;
	private String dataInicio;
	
	
	public Modulo() {
		
	}
	
	public Modulo(String descNome,String descInstrutorTitular, String descInstrutorAuxiliar, String dataInicio ) {
		this.descNome = descNome;
		this.descInstrutorTitular = descInstrutorTitular;
		this.descInstrutorAuxiliar = descInstrutorAuxiliar;
		this.dataInicio = dataInicio;
	}
	
	public String getDescNome() {
		return descNome;
	}
	public void setDescNome(String descNome) {
		this.descNome = descNome;
	}
	public String getDescInstrutorTitular() {
		return descInstrutorTitular;
	}
	public void setDescInstrutorTitular(String descInstrutorTitular) {
		this.descInstrutorTitular = descInstrutorTitular;
	}
	public String getDescInstrutorAuxiliar() {
		return descInstrutorAuxiliar;
	}
	public void setDescInstrutorAuxiliar(String descInstrutorAuxiliar) {
		this.descInstrutorAuxiliar = descInstrutorAuxiliar;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	

}
