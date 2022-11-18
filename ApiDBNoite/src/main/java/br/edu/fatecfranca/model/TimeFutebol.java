package br.edu.fatecfranca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // anotação que decora a classe
@Table(name="TimeFutebol") // anotação que decora a classe
public class TimeFutebol {

	// define a chave primária com auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="qtdeJogadores")
	private int qtdeJogadores;
	
	@Column(name="nota")
	private float nota;
	
	public TimeFutebol() {
		
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

	public int getQtdeJogadores() {
		return qtdeJogadores;
	}

	public void setQtdeJogadores(int qtdeJogadores) {
		this.qtdeJogadores = qtdeJogadores;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
}
