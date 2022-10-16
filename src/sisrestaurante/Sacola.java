package com.netbiis.sisrestaurante;

public class Sacola {
	
	private Pedido pedido;
	private Entrega entrega;
	private Pagamento pagamento;
	
	public Sacola(Pedido pedido, Entrega entrega, Pagamento pagamento) {
		super();
		this.pedido = pedido;
		this.entrega = entrega;
		this.pagamento = pagamento;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	

}
