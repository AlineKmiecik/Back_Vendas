package com.coisas_coisas.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vendas")
public class Venda implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_Venda")
	private int Codigo_venda;
	@Column(name = "Data")
	private Date Data;
	@OneToMany(fetch =FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Produto_Venda> Produtos;
	@OneToOne(fetch = FetchType.LAZY)
	private Titulo Titulo;
	@OneToOne(fetch = FetchType.LAZY)
	private Vendedor Vendedor;
	@OneToOne(fetch = FetchType.LAZY)
	private Cliente Cliente;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo_venda() {
		return Codigo_venda;
	}

	public void setCodigo_venda(int codigo_venda) {
		Codigo_venda = codigo_venda;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public List<Produto_Venda> getProdutos() {
		return Produtos;
	}

	public void setProdutos(List<Produto_Venda> produtos) {
		Produtos = produtos;
	}

	public Titulo getTitulo() {
		return Titulo;
	}

	public void setTitulo(Titulo titulo) throws Exception {
		if(titulo.getSituacao().equalsIgnoreCase("PENDENTE") || titulo.getSituacao().equalsIgnoreCase("PAGO") ) {
			Titulo = titulo;
		}else {
			throw new Exception("Título com situação inválida");
		}
		
	}

	public Vendedor getVendedor() {
		return Vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	

}
