package com.coisas_coisas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Produto_Venda implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_produto_venda")
	private int Codigo_produto_venda;
	@OneToOne(fetch = FetchType.LAZY)
	private Produto Produto;
	@Column(name = "Quantidade")
	private int Quantidade;
	
	
	public Produto_Venda() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigo_produto_venda() {
		return Codigo_produto_venda;
	}


	public void setCodigo_produto_venda(int codigo_produto_venda) {
		Codigo_produto_venda = codigo_produto_venda;
	}


	public int getQuantidade() {
		return Quantidade;
	}


	public void setQuantidade(int quantidade) {
		if(quantidade>=0) {
			this.Quantidade = quantidade;
		}		
	}


	public Produto getProduto() {
		return Produto;
	}


	public void setProduto(Produto produto) {
		Produto = produto;
	}
	
	
	
}
