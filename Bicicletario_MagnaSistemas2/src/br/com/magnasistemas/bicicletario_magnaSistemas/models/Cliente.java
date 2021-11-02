package br.com.magnasistemas.bicicletario_magnaSistemas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.magnasistemas.bicicletario_magnaSistemas.enums.StatusParaLocacao;

//@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Id
	private int id;
	private int idade;
	private String nome;
	private String cpf;
	private StatusParaLocacao splCliente;
	private Endereco endereco;
	
	public Cliente(int id, int idade, String nome, String cpf, StatusParaLocacao splCliente){
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.splCliente = splCliente;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public StatusParaLocacao getSpl() {
		return splCliente;
	}
	public void setSpl(StatusParaLocacao spl) {
		this.splCliente = spl;
	}	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((splCliente == null) ? 0 : splCliente.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (splCliente != other.splCliente)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", idade=" + idade + ", nome=" + nome + ", cpf=" + cpf + ", splCliente=" + splCliente
				+ ", endereco=" + endereco + "]";
	}
	
}
