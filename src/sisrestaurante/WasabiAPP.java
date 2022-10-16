/*****************************/

package com.netbiis.sisrestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.AppLanchesDAO;

/*****************************/

/**
* @author Paulo de Freitas
* @version 1.0
* @since 13-10-2022
*/

/**
* Classe da camada de aplicação do sistema.
*/

public class WasabiAPP {

	
	static private Pedido pedido;
	static private Pagamento pagamento;
	static private Entrega entrega;
	
	static private Sacola sacola;
	
	private static double taxaEntrega = 0;
	
	
	private static AppLanchesDAO appLanchesDAO = new AppLanchesDAO();;
	
	/**
	   * Método principal da camada de aplicação do sistema.
	   * 
	   * @param args argumento default do método principal
	*/

	public static void main(String[] args) {
		
		criarCliente("Fulano", "12345676790", "918173821738", "Rua exemplo", "12321314324");
		
		criarProduto("Combo Promo 01 (15 peças)", "5 peças do holl de salmão grelhado, cream cheese, alga nori, arroz, gergilim e biscoitinho tempurá", 23.5, "URL WASABIHOLLMET");
		
		
		List<Produto> listaProdutos = new ArrayList();
		
		listaProdutos.add(comboPromo01);
		
		adicionarTaxaEntrega(20);
		
		criarPedido(cliente, listaProdutos);
		
		System.out.println(pedido);
		
		criarEntrega(cliente.getEndereco(), pedido.getTotal());
		
		realizarPagamento(cliente.getCartaoCredito(),cliente.getCpf());

		finalizarSacola(pedido, entrega, pagamento);
		
		 System.out.println(sacola.getPedido().getTaxaEntrega());
		
	}
	
	/**
	   * Método para criar um pedido no restaurante.
	   * 
	   * @param cliente instância da classe Cliente, que representa o cliente que realizará o pedido
	   * @param listaProdutos uma lista de objetos do tipo Produto, que representa a lista de produtos que estarão no pedido
	*/
	
	static void criarPedido(Cliente cliente, List<Produto> listaProdutos) {
		
		Pedido pedidoGerado = new Pedido(cliente ,listaProdutos, taxaEntrega);
		
		appLanchesDAO.gravarPedido(pedido);
		
		
	}
	
	/**
	   *
	   * Método para criar uma entrega no restaurante.
	   * 
	   * @param endereco uma String que representa o endereço que o pedido deverá ser entregue
	   * @param totalPedido um double que representa o valor total do Pedido
	   *
	*/
	
	
	static void criarEntrega(String endereco, double totalPedido) {
		
		Entrega entrega = new Entrega(endereco, totalPedido);
		
		appLanchesDAO.gravarEntrega(entrega);
		
	}
	
	/**
	   * Método para realizar o pagamento do pedido.
	   * 
	   * @param cartao uma String que representa o número do cartão que irá realizar o pagamento do pedido
	   * @param cpf uma String que representa o número de Cpf do Cliente
	*/
	
	
	static void realizarPagamento(String cartao, String cpf) {
		
		Pagamento pagamento = new Pagamento(cartao, cpf);
				
		appLanchesDAO.gravarPagamento(pagamento);
	}
	
	/**
	   * Método para adicionar taxa de entrega ao pedido.
	   * 
	   * @param taxaEntregaPedido um double, que representa a taxa de entregue para ser adicionada ao pedido
	*/
	
	
	static void adicionarTaxaEntrega(double taxaEntregaPedido) {
		taxaEntrega = taxaEntregaPedido;
	}
	
	/**
	   * Método para finalizar um pedido no restaurante.
	   * 
	   * @param pedido instância da classe Pedido, que representa o Pedido realizado
	   * @param entrega instância da classe Entrega, que representa a Entrega do pedido
	   * @param pagamento instância da classe Pagamento, que representa o Pagamento do pedido
	*/
	
	
	static void finalizarSacola(Pedido pedido, Entrega entrega, Pagamento pagamento) {
		
		Sacola sacolaGerada = new Sacola(pedido, entrega, pagamento);
		
		appLanchesDAO.gravarSacola(sacola);
		
	}
	
	static void criarCliente(String nome, String cpf, String numeroTelefone, String endereco, String numeroCartao) {
		
		Cliente cliente = new Cliente(nome, cpf, numeroTelefone, endereco, numeroCartao);
		
		appLanchesDAO.gravarCliente(cliente);
		
	}
	
	static void criarProduto(String nome, String descricao, double valor, String imagem ) {
		
		Promocao produto = new Promocao(nome, descricao, valor, imagem);
		
		appLanchesDAO.gravarProduto(produto);
		
	}
	
}
