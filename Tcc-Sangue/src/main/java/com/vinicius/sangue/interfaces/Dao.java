package com.vinicius.sangue.interfaces;

import java.util.List;

public interface Dao<B,F> {

	public void salvar(B b);
	public void excluir(B b);
	public List<B> filtrar(F f);
	
	
}
