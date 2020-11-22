package com.coisas_coisas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_produto")
	private int Codigo_produto;
	@Column(name = "Nome")
	private String Nome;
	@Column(name = "Preco")
	private Double Preco;
	
	private void Prodto() {
		// TODO Auto-generated method stub

	}

	public int getCodigo_produto() {
		return Codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		this.Codigo_produto = codigo_produto;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		this.Preco = preco;
	}
	
	
}
