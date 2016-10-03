package com.vinicius.start;

import com.vinicius.model.Equacao;
import com.vinicius.regrasNegocios.Regras;

public class Start {

	public static void main(String[] args) {
		Equacao e = new Equacao(1,-3,-4);
		
		Regras r = new Regras();
		r.resultado(e);
        System.out.println(r.checarDelta(e));
		
	}

}
