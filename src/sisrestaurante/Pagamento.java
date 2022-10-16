package com.netbiis.sisrestaurante;

public class Pagamento {
	
	private String cartao;
	private String cpf;
	
	public Pagamento(String cartao, String cpf) {
		super();
		this.cartao = cartao;
		this.cpf = cpf;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
