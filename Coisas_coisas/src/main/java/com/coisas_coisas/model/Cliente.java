package com.coisas_coisas.model;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "Codigo_cliente")
	private int Codigo_cliente;
	
	@Column(name = "cpf_cnpj")
	private String cpf_cnpj;
	@Column(name = "Nascimento")
	private Date Nascimento;
	@Column(name = "Nome")
	private String Nome;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo_cliente() {
		return Codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		Codigo_cliente = codigo_cliente;
	}
	
	public String getcpf_cnpj() {
		return cpf_cnpj;
	}
	public void setcpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public Date getNascimento() {
		return Nascimento;
	}

	public void setNascimento(Date nascimento) {
		Nascimento = nascimento;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
}
