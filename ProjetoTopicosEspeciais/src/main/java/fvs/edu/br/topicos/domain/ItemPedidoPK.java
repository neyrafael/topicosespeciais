package fvs.edu.br.topicos.domain;

import java.io.Serializable;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class ItemPedidoPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Pedido pedido;
	
	@OneToMany
	private Produto produto;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}

