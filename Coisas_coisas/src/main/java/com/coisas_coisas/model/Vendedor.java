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
@Table(name = "Vendedores")
public class Vendedor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo_funcionario")
	private int Codigo_funcionario;	
	
	@Column(name = "Cpf")
	private String Cpf;
	@Column(name = "Salario")
	private double Salario;
	@Column(name = "Nascimento")
	private Date Nascimento;
	@Column(name = "Nome")
	private String Nome;
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo_funcionario() {
		return Codigo_funcionario;
	}

	public void setCodigo_funcionario(int codigo_funcionario) {
		Codigo_funcionario = codigo_funcionario;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
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
