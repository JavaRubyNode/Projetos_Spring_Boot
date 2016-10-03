package com.vinicius.model;



public class Equacao {
	
	//@Id
	//@GeneratedValue		
	private long id; 
	
	//@NumberFormat(pattern = "#,##0.00")
	//@NotEmpty (message="Informe um valor para a variavel A")
	private double valor_a;
	
	//@NumberFormat(pattern = "#,##0.00")
	//@NotEmpty (message="Informe um valor para a variavel B")
	private double valor_b;
	
	//@NumberFormat(pattern = "#,##0.00")
	//@NotEmpty (message="Informe um valor para a variavel C")
	private double valor_c;
	
	
	private double delta; 
	private double x_vertice;
	private double y_vertice;
	private String equacao; 
	private double x1;
	private double x2;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor_a() {
		return valor_a;
	}
	public void setValor_a(double valor_a) {
		this.valor_a = valor_a;
	}
	public double getValor_b() {
		return valor_b;
	}
	public void setValor_b(double valor_b) {
		this.valor_b = valor_b;
	}
	public double getValor_c() {
		return valor_c;
	}
	public void setValor_c(double valor_c) {
		this.valor_c = valor_c;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	public double getX_vertice() {
		return x_vertice;
	}
	public void setX_vertice(double x_vertice) {
		this.x_vertice = x_vertice;
	}
	public double getY_vertice() {
		return y_vertice;
	}
	public void setY_vertice(double y_vertice) {
		this.y_vertice = y_vertice;
	}
	public String getEquacao() {
		return equacao;
	}
	public void setEquacao(String equacao) {
		this.equacao = equacao;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	public Equacao() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equacao other = (Equacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Equacao(double valor_a, double valor_b, double valor_c) {
		super();
		this.valor_a = valor_a;
		this.valor_b = valor_b;
		this.valor_c = valor_c;
	}
	
	
	
	

}
