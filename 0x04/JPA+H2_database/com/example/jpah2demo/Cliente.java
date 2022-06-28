package com.example.jpah2demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nome;
	
	private int idade;
	
	private String email;
	
	@OneToMany
	@JoinColumn(name = "endereco_id")
	private List<Endereco> endereco;
	
	@OneToMany
	@JoinColumn(name = "telefone_id")
	private List<Telefone> telefone;
	
	
	public Cliente() {}

	public Cliente(Long id, String nome, int idade, String email, List<Endereco> endereco,
			List<Telefone> telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}
	
	
	
	

}
