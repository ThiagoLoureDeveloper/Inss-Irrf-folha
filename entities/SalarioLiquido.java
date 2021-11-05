package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//Criar tabela no banco de dados
public class SalarioLiquido {

	@Id // identificar a chave primaria;]
	@GeneratedValue(strategy = GenerationType.AUTO) // serve para criar a chave primaria de forma automatica;
	private long id;// sempre a chave primária por padrão no início da lista;
	private double salarioBruto;
	private int diasTrabalhados;
	private double resultado;

	public SalarioLiquido() {

	}

	public SalarioLiquido(long id, double salarioBruto, int diasTrabalhados, double resultado) {
		super();
		this.id = id;
		this.salarioBruto = salarioBruto;
		this.diasTrabalhados = diasTrabalhados;
		this.resultado = resultado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}
