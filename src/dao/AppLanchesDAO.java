package dao;

import java.util.ArrayList;
import java.util.List;

import com.netbiis.sisrestaurante.Cliente;
import com.netbiis.sisrestaurante.Entrega;
import com.netbiis.sisrestaurante.Pagamento;
import com.netbiis.sisrestaurante.Pedido;
import com.netbiis.sisrestaurante.Produto;
import com.netbiis.sisrestaurante.Sacola;

public class AppLanchesDAO<T> implements IDAO<T> {
	
	List<Cliente> clientes = new ArrayList<>();
	List<Produto> produtos = new ArrayList<>();
	List<Pedido> pedidos = new ArrayList<>();
	List<Entrega> entregas = new ArrayList<>();
	List<Pagamento> pagamentos = new ArrayList<>();
	List<Sacola> sacolas = new ArrayList<>();


	@Override
	public void gravarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente gravado com sucesso");
	}

	@Override
	public void gravarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto gravado com sucesso");	
	}

	@Override
	public void gravarPedido(Pedido pedido) {
		pedidos.add(pedido);
		System.out.println("Pedido gravado com sucesso");
	}

	public void gravarEntrega(Entrega entrega) {
		entregas.add(entrega);
		System.out.println("Entrega gravada com sucesso");
	}

	public void gravarPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
		System.out.println("Pagamento gravado com sucesso");
	}

	public void gravarSacola(Sacola sacola) {
		sacolas.add(sacola);
		System.out.println("Sacola gravada com sucesso");
	}
}

