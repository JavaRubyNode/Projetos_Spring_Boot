package com.vinicius.sangue.enums;

public enum RedesSociais {

	INSTRAGAM(""),
	FACEBOOK(""),
	WHASTAPP(""),
	SNAPCHAT(""),
	TWITTER(""),
	WECHAT(""),
	LINE(""),
	GOOGLE("");
	
	private String redes;
	
	RedesSociais (String redes){
		this.redes =redes;
	}
	
	public String getRedes(){
		return redes;
	}
	
}
