package dao;

import com.netbiis.sisrestaurante.Cliente;
import com.netbiis.sisrestaurante.Pedido;
import com.netbiis.sisrestaurante.Produto;

public interface IDAO <T> {

	public void gravarCliente(Cliente cliente);
	
	public void gravarProduto(Produto produto);
	
	public void gravarPedido(Pedido pedido);
	
}
