package com.example.locadora.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "aluguel")
public class Aluguel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5891529122091164642L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@MapsId(value="filial_saida")
	@ManyToOne(fetch=FetchType.LAZY)
	private Filial filialSaida;
	
	@MapsId(value="filial_entrega")
	@ManyToOne(fetch=FetchType.LAZY)
	private Filial filialEntrega;

	@MapsId
	@ManyToOne
	private Cliente cliente;
	
	private Date saida;
	
	private Date entrega;

	@Column(name = "cod_aluguel", unique = true)
	private String codAluguel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filial getFilialSaida() {
		return filialSaida;
	}

	public void setFilialSaida(Filial filialSaida) {
		this.filialSaida = filialSaida;
	}

	public Filial getFilialEntrega() {
		return filialEntrega;
	}

	public void setFilialEntrega(Filial filialEntrega) {
		this.filialEntrega = filialEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public String getCodAluguel() {
		return codAluguel;
	}

	public void setCodAluguel(String codAluguel) {
		this.codAluguel = codAluguel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
