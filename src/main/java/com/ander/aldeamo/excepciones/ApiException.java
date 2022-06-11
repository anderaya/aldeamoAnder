
package com.ander.aldeamo.excepciones;

public class ApiException extends RuntimeException{
	
	private String code;

	public ApiException(String code,String message) {
		super(message);
		this.code=code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
