package com.example.jpah2demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String DDD;
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

}
