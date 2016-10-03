package br.com.vinicius.concurso.model;

public class ProgressaoAritmetica {

	private double a1;
	private double an;
	private double razao; 
	private double n; 
	private double Sn;
	private double valorAn;
	private double termo1;
	private double termo2;
	private double valor_termo1;
	private double valor_termo2;
	
	
	
	public double getValor_termo1() {
		return valor_termo1;
	}
	public void setValor_termo1(double valor_termo1) {
		this.valor_termo1 = valor_termo1;
	}
	public double getValor_termo2() {
		return valor_termo2;
	}
	public void setValor_termo2(double valor_termo2) {
		this.valor_termo2 = valor_termo2;
	}
	public double getTermo1() {
		return termo1;
	}
	public void setTermo1(double termo1) {
		this.termo1 = termo1;
	}
	public double getTermo2() {
		return termo2;
	}
	public void setTermo2(double termo2) {
		this.termo2 = termo2;
	}
	public double getValorAn() {
		return valorAn;
	}
	public void setValorAn(double valorAn) {
		this.valorAn = valorAn;
	}
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getAn() {
		return an;
	}
	public void setAn(double an) {
		this.an = an;
	}
	public double getRazao() {
		return razao;
	}
	public void setRazao(double razao) {
		this.razao = razao;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getSn() {
		return Sn;
	}
	public void setSn(double sn) {
		Sn = sn;
	}
	public ProgressaoAritmetica() {
		super();
	}
	public ProgressaoAritmetica(double a1, double an, double razao) {
		super();
		this.a1 = a1;
		this.an = an;
		this.razao = razao;
	}
	public ProgressaoAritmetica(double an, double razao, double n, double valorAn) {
		super();
		this.an = an;
		this.razao = razao;
		this.n = n;
		this.valorAn = valorAn;
	}
	public ProgressaoAritmetica(double n, double termo1, double termo2, double valor_termo1, double valor_termo2) {
		super();
		this.n = n;
		this.termo1 = termo1;
		this.termo2 = termo2;
		this.valor_termo1 = valor_termo1;
		this.valor_termo2 = valor_termo2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
