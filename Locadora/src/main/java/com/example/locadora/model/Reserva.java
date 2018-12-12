package com.example.locadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5891529122091164642L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@MapsId
	@ManyToOne
	private Filial filial;

	@MapsId
	@ManyToOne
	private Cliente cliente;

	@Column(name = "tipo_carro")
	private Character tipoCarro;

	@Column(name = "cod_reserva", unique = true)
	private String codReserva;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(String codReserva) {
		this.codReserva = codReserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Character getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(Character tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	
	
	
	
}
