/*****************************/

package com.netbiis.sisrestaurante;


/*****************************/


/**
*
* Classe que abstrai os Clientes do sistema
*
*/

public class Cliente {
	private long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private String cartaoCredito;
	
	static private int incrementador = 1;
	
	public Cliente(String nome, String cpf, String telefone, String endereco, String cartaoCredito) {
		super();
		this.id = incrementador;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cartaoCredito = cartaoCredito;
	}
	
	static private void incrementaId() {
		incrementador += 1; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}	
	
	
}
