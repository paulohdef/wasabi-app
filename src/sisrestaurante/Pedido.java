package com.netbiis.sisrestaurante;

import java.util.List;

/*****************************/


/**
*
* Classe da camada de aplicação do sistema.
*
*/

public class Pedido {
	private long id;	
	private double total = 0;
	private Cliente cliente;
	private List<Produto> produtos; 
	private double taxaEntrega = 0;
	private double subtotal = 0;
	
	static private int incrementador = 1;
	
	
	public Pedido(Cliente cliente, List<Produto> produtos, double taxaEntrega) {
		super();
		this.id = incrementador;
		this.cliente = cliente;
		this.produtos = produtos;
		this.taxaEntrega = taxaEntrega;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		
		
		this.total = this.subtotal + this.taxaEntrega;
		
		return total;
	}

	public void setTotal(double total) {

		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}

	public double getSubtotal() {
		for (Produto produto : produtos) {
			this.subtotal += produto.getValor();
		}
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	static private void incrementaId() {
		incrementador += 1; 
	}	
}
