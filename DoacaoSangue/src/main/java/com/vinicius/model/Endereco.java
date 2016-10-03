package com.vinicius.model;

public class Endereco {

	
	private String logradouro; 
	private String pais; 
	private String estado; 
	private String cep;
	private int numero;
	
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Endereco(String logradouro, String pais, String estado, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.pais = pais;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}
	public Endereco() {
		super();
	} 
	
	
	
	
	
}
