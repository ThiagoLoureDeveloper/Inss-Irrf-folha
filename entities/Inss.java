package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double salarioContribuinte;
	private double aliquota;
	
	public Inss() {
		
	}

	public Inss(long id, double salarioContribuinte, double aliquota) {
		super();
		this.id = id;
		this.salarioContribuinte = salarioContribuinte;
		this.aliquota = aliquota;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalarioContribuinte() {
		return salarioContribuinte;
	}

	public void setSalarioContribuinte(double salarioContribuinte) {
		this.salarioContribuinte = salarioContribuinte;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	
	
	
}
