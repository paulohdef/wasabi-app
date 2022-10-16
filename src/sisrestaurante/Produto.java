/*****************************/

package com.netbiis.sisrestaurante;

import java.util.HashMap;

import java.util.Map;

/*****************************/


/**
*
* Classe de Produto do sistema
*
*/

public class Produto {
	
	private long id;
	private String nome;
	private String descricao;
	private double valor;
	private String imagem;

	static private int incrementador = 1;
	
	public Produto(String nome, String descricao, double valor, String imagem) {
		this.id = incrementador;
		this.nome = nome;
		this.valor = valor;
		this.imagem = imagem;
		this.descricao = descricao;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	/**
	   *
	   * Método para criar uma entrega no restaurante.
	   * 
	   * @param endereco uma String que representa o endereço que o pedido deverá ser entregue
	   * 
	   * @param totalPedido um double que representa o valor total do Pedido
	   *
	*/
	 
	public Map<String, Object>getInfos() {
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		
		mapInfo.put("nome", this.getNome());
		mapInfo.put("descricao", this.getDescricao());
		mapInfo.put("preco", this.getValor());
		mapInfo.put("imagem", this.getImagem());

		return mapInfo;
	}
	
	
}
