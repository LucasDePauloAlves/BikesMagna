package br.com.magnasistemas.bicicletario_magnaSistemas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import br.com.magnasistemas.bicicletario_magnaSistemas.enums.StatusParaLocacao;

//@Entity
public class Bicicleta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@Id
	private int id;
	private int aro;
	//@Enumerated(EnumType.STRING)
	private StatusParaLocacao splBicicleta;
	
	Bicicleta(){};
	
	public Bicicleta(int id, int aro, StatusParaLocacao splBicicleta){
		this.id = id;
		this.aro = aro;
		this.splBicicleta = splBicicleta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public StatusParaLocacao getSplBicicleta() {
		return splBicicleta;
	}
	public void setSplBicicleta(StatusParaLocacao splBicicleta) {
		this.splBicicleta = splBicicleta;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aro;
		result = prime * result + id;
		result = prime * result + ((splBicicleta == null) ? 0 : splBicicleta.hashCode());
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
		Bicicleta other = (Bicicleta) obj;
		if (aro != other.aro)
			return false;
		if (id != other.id)
			return false;
		if (splBicicleta != other.splBicicleta)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Bicicleta [id=" + id + ", aro=" + aro + ", splBicicleta=" + splBicicleta + "]";
	} 
	
}
