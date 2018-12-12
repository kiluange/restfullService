package com.example.locadora.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity(name="pessoa_fisica")
public class PessoaFisica extends Cliente {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2509924057545207910L;

	private String cpf;
	private Character sexo;
	private Date aniversario;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
