package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Irrf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double baseCalculo;
	private double aliquota;
	private double deducao;

	public Irrf() {

	}

	public Irrf(long id, double baseCalculo, double aliquota, double deducao) {
		super();
		this.id = id;
		this.baseCalculo = baseCalculo;
		this.aliquota = aliquota;
		this.deducao = deducao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(double baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double getDeducao() {
		return deducao;
	}

	public void setDeducao(double deducao) {
		this.deducao = deducao;
	}

}
