package com.coisas_coisas.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Titulos_venda")
public class Titulo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_titulo")
	private int Codigo_titulo;
	@Column(name = "Data_criacao")
	private Date Data_criacao;
	@Column(name = "Data_Vencimento")
	private Date Data_Vencimento;
	@Column(name = "Situacao")
	private String Situacao;
	@Column(name = "Valor")
	private Double Valor;
	
	public Titulo() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo_titulo() {
		return Codigo_titulo;
	}

	public void setCodigo_titulo(int codigo_titulo) {
		Codigo_titulo = codigo_titulo;
	}

	public Date getData_criacao() {
		return Data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		Data_criacao = data_criacao;
	}

	public Date getData_Vencimento() {
		return Data_Vencimento;
	}

	public void setData_Vencimento(Date data_Vencimento) {
		Data_Vencimento = data_Vencimento;
	}

	public String getSituacao() {
		return Situacao;
	}

	public void setSituacao(String situacao) {
		if(situacao.equalsIgnoreCase("PENDENTE") || situacao.equalsIgnoreCase("PAGO") ) {
			Situacao = situacao.toLowerCase();
		}
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}
	
	
	
}
