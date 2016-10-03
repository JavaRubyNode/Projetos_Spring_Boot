package com.vinicius.sangue.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import com.vinicius.sangue.enums.RedesSociais;
import com.vinicius.sangue.enums.TipoSanguineo;


@Entity
public class Doador implements Serializable {

	
	private static final long serialVersionUID = -4347462056160736974L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@NotEmpty(message ="Nome é obrigatório")
	@Size(max=20,message="O nome não pode ter mais que 20 caracteres")
	private String nome;
	
	
	@NotEmpty(message="Sobrenome é obrigatório")
	@Size(max=50, message="O sobrenome não pode ter mais que 50 caracteres")
	private String sobrenome;
	
	@NotEmpty(message="Email é obrigatório")
	@Size(max=30, message="O email não pode ter mais que 30 caracteres")
	@Pattern(regexp = "^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$", 
	message="E-mail com formato incorreto.")
	private String email; 
	
	@NotNull(message="Idade é obrigatório")
	@NumberFormat(pattern="#,##0.00")
	private int idade;
	
	@NotEmpty(message="Telefone é obrigatório")
	@Size(max=12,message="O telefone não pode ter mais que 12 caracteres")
	@Pattern(regexp = "\\(?\\b([0-9]{2})\\)?[-. ]?([0-9]{4})[-. ]?([0-9]{4})\\b", 
	message="Telefone em formato incorreto")
	private String telefone;
	
	
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	private RedesSociais rede;
	
	@Enumerated(EnumType.STRING)
	private TipoSanguineo sangue;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public RedesSociais getRede() {
		return rede;
	}

	public void setRede(RedesSociais rede) {
		this.rede = rede;
	}

	public TipoSanguineo getSangue() {
		return sangue;
	}

	public void setSangue(TipoSanguineo sangue) {
		this.sangue = sangue;
	}

	public Doador(String nome, String sobrenome, String email, int idade, String telefone, String cpf,
			RedesSociais rede, TipoSanguineo sangue) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rede = rede;
		this.sangue = sangue;
	}

	public Doador() {
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
		Doador other = (Doador) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
