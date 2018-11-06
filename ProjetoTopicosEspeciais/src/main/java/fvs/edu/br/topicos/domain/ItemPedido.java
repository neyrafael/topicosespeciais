package fvs.edu.br.topicos.domain;

import javax.persistence.EmbeddedId;

public class ItemPedido {
	
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private Double desconto;
	private Double preco;
	private Integer quantidade;
	

	public ItemPedido(Double desconto, Double preco, Integer quantidade) {
		super();
		this.desconto = desconto;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public ItemPedidoPK getId() {
		return id;
	}


	public void setId(ItemPedidoPK id) {
		this.id = id;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}