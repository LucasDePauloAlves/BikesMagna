package br.com.magnasistemas.bicicletario_magnaSistemas.enums;

public enum StatusParaLocacao {

	DISPONIVEL(1),
	INDISPONIVEL(0);
	
	private int disponibilidade;
	
	StatusParaLocacao(int num){
		this.disponibilidade = num;
	}
	
	public int getDisponibilidade() {
		return disponibilidade;
	}
	
	public void setDisponibilidade(int i) {
		this.disponibilidade = i;
	}
}
