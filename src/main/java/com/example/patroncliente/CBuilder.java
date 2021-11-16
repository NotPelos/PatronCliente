package com.example.patroncliente;

public class CBuilder {
	
	private String status;
	
	public CBuilder status(String status) {
		this.status = status;
		return this;
	}
	
	public Coche build() {
		return new Coche(status);
	}

}
