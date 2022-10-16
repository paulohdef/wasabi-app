package com.netbiis.sisrestaurante;

public class Entrega {

	private String endereco;
	private double total;
	
	public Entrega(String endereco, double total) {
		super();
		this.endereco = endereco;
		this.total = total;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
