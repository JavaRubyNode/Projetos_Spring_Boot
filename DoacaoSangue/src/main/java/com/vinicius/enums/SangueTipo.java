package com.vinicius.enums;

public enum SangueTipo {

       ANEGATIVO("A-"),
       APOSITIVO("A+"),
       BNEGATIVO("B-"),
       BPOSITIVO("B+"),
       ONEGATIVO("O-"),
       OPOSITIVO("O+"),
       ABNEGATIVO("AB-"),
       ABPOSITIVO("AB+")
       ;
	
	private String tipoSangue; 
	
	SangueTipo (String sangue){
		this.tipoSangue=sangue;
	}
	
	public String getTipoSangue(){
		return tipoSangue;
	}
	
	
}
