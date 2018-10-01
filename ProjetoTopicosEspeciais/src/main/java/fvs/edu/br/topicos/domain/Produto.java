package fvs.edu.br.topicos.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Produto {

	private Integer id;
	private String nome;
	private Double preco;
		
	@ManyToMany
	@JoinTable (name = "PRODUTO_CATEGORIA", joinColumns = @JoinColumns(name = "produto_id"), inverseJoinColumns = @JoinColumns (name = "categoria_id"))
	List<Categoria> categorias = new ArrayList<>();
	

	
}
