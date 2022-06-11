package com.ander.aldeamo.excepciones;

public class Errores {

	private String mensaje;
	
	private String code;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Errores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Errores(String mensaje, String code) {
		super();
		this.mensaje = mensaje;
		this.code = code;
	}

	
	
}
