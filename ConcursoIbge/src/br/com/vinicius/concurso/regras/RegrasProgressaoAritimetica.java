package br.com.vinicius.concurso.regras;

import br.com.vinicius.concurso.model.ProgressaoAritmetica;

public class RegrasProgressaoAritimetica {
	
	
	public double calcularAn (ProgressaoAritmetica pa){
		pa.setN(pa.getAn());
		pa.setAn(pa.getA1()+((pa.getN()-1)*pa.getRazao()));
		return pa.getAn();
				
	}
  
	
	public double calcularA1(ProgressaoAritmetica pa){
				pa.setA1((pa.getAn()*(-1))+((pa.getN()-1)*pa.getRazao()));
				if(pa.getA1()<0){
			pa.setA1(pa.getA1()*(-1));
		}
		return pa.getA1();
	}
	
		
	public double determinante(ProgressaoAritmetica pa){
				double det = (1*(pa.getTermo2()-1))-((pa.getTermo1()-1)*1);
					return det;
		
			
	}
	
	public double valorYRazao(ProgressaoAritmetica pa){
		double x;
		
         double detx = (pa.getValor_termo2()*1)
        -(pa.getValor_termo1()*1);	

                x = detx/determinante(pa);

		return x;
	}
	
	
	
	public double valorXA1(ProgressaoAritmetica pa){
		double y;
		double dety = (pa.getValor_termo1()*(pa.getTermo2()-1))-
				(pa.getValor_termo2()*(pa.getTermo1()-1));
		y = dety/determinante(pa);
		return y;
	}
	
	
	
	
	
	
	
	
}
