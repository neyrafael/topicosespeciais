package fvs.edu.br.topicos.domain;

import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pagamento {
private Integer id;
	private Integer estados;
@JsonIgnore
@OneToOne
@JoinColumn(name="pedido_id")
@MapsId
private Pedido pedido;
public Pagamento() {
	
}
public Pagamento(Integer id, Estado Pagamento, Integer estados, Pedido pedido) {
	super();
	this.id = id;
	this.estados = estados.getCod();
	this.pedido = pedido;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getEstados() {
	return estados;
}
public void setEstados(Integer estados) {
	this.estados = estados;
}
public Pedido getPedido() {
	return pedido;
}
public void setPedido(Pedido pedido) {
	this.pedido = pedido;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pagamento other = (Pagamento) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}
