package br.com.magnasistemas.bicicletario_magnaSistemas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "ESTADO")
public class EstadoUF implements Serializable{

	private static final long serialVersionUID = 1L;

	//@Id
	//@Column(name = "SIGLA", nullable = false, length = 2)
	private String sigla;
	
	//@Column(name = "NOME", nullable = false, length = 30)
	private String nome;
	
	public EstadoUF(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
