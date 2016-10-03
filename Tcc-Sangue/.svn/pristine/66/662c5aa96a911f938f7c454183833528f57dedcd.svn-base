package com.vinicius.sangue.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.sangue.bean.Doador;
import com.vinicius.sangue.enums.TipoSanguineo;

public interface BeanFilterDoacao extends JpaRepository<Doador, TipoSanguineo>{
	

	public List<Doador> findBySangueContaining(String sangue);
	
	
}
