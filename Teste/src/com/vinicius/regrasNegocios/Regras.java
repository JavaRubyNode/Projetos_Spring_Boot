package com.vinicius.regrasNegocios;

import com.vinicius.model.Equacao;

public class Regras {

	
	
	
	
	public double calcularDelta(Equacao e){
		e.setDelta(Math.sqrt((Math.pow(e.getValor_b(), 2))-(4*e.getValor_a()*e.getValor_c())));
		return e.getDelta();
			
	}
	
	
	public double raizX1(Equacao e){
		e.setX1(((-1*e.getValor_b())+calcularDelta(e))/2*e.getValor_a());
				return e.getX1();
		
	}
	
	public double raizX2(Equacao e){
		e.setX2(((-1*e.getValor_b())-calcularDelta(e))/2*e.getValor_a());
		return e.getX2();
	}
	
	public double verticeX(Equacao e){
		e.setX_vertice(((-1)*e.getValor_b())/2*e.getValor_a());
		return e.getX_vertice();
		
	}
	
	public double verticeY(Equacao e){
		e.setY_vertice(calcularDelta(e)/4*e.getValor_a());
		return e.getY_vertice();
	}
	
	public void resultado(Equacao e){
		System.out.println("o valor do delta = "+ calcularDelta(e)+
				"\n" +" o valor da raiz 1 = "+raizX1(e)+"\n "+ "o valor da raiz 2 = "+raizX2(e)+
				"\n"+"O valor do x do vertice = "+verticeX(e)+
				"\n"+"O valor do y do vertice = " +verticeY(e));
	}
	
	public String checarDelta(Equacao e){
		
		String delta = "";
		
		switch (testarDelta(e)){
		
		case 1 :
			delta="Sendo delta igual a zero tera 2 raizes iguais ";
			break;
		case 2:
			delta = "Sendo delta negativo não tem solução no campo Reais";
			break;
		case 3:
			delta = "Sendo delta positivo terá 2 raizes distintas";
			break;
		default:
			delta = "Valores informados são invalidos";
			
		
		}
		
		
		
		return delta;
	}
	
	public int testarDelta(Equacao e ){
		
		int temp=0;
		if (calcularDelta(e)==0){
			temp=1;
		}if(calcularDelta(e)<0){
			 temp=2;
		}if(calcularDelta(e)>0){
			temp=3;
		}
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
