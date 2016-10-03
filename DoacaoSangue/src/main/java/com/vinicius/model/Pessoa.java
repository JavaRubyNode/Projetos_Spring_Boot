package com.vinicius.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.vinicius.enums.RedesSociais;
import com.vinicius.enums.SangueTipo;

@Entity
public class Pessoa {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Size(max = 60, message = "A descrição não pode conter mais de 60 caracteres")
	private String nome;
	
	@NotEmpty(message="RG e obrigatorio")
	private String rg;
	
	@NotEmpty(message="CPF e obrigatório")
	private String cpf;
	
	@NotEmpty(message="Idade e obrigatória")
	private int idade;
	
	@NotEmpty(message="Email e obrigatório")
	private String email;
	
	@Enumerated(EnumType.STRING)
	private SangueTipo sangueTipoEnum;
	
	@NotEmpty(message="Email e obrigatório")
	private String telefoneFixo;
	
	@NotEmpty(message="Celular1 e obrigatório")
	private String celular1;
	
	@NotEmpty(message="Celular2 e obrigatório")
	private String celular2;
	
	@NotEmpty(message="Celular3 e obrigatório")
	private String celular3;
	
	@Enumerated(EnumType.STRING)
	private RedesSociais redes;
	private Endereco endereco;
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SangueTipo getSangueTipoEnum() {
		return sangueTipoEnum;
	}
	public void setSangueTipoEnum(SangueTipo sangueTipoEnum) {
		this.sangueTipoEnum = sangueTipoEnum;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getCelular1() {
		return celular1;
	}
	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}
	public String getCelular2() {
		return celular2;
	}
	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}
	public String getCelular3() {
		return celular3;
	}
	public void setCelular3(String celular3) {
		this.celular3 = celular3;
	}
	public RedesSociais getRedes() {
		return redes;
	}
	public void setRedes(RedesSociais redes) {
		this.redes = redes;
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
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
