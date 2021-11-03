package br.com.magnasistemas.bicicletario_magnaSistemas.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.bicicletario_magnaSistemas.enums.StatusParaLocacao;
import br.com.magnasistemas.bicicletario_magnaSistemas.models.Bicicleta;
import br.com.magnasistemas.bicicletario_magnaSistemas.models.Cliente;
import br.com.magnasistemas.bicicletario_magnaSistemas.models.Endereco;

public class application {

	public static void main(String[] args) {
		
//		StatusParaLocacao spl = StatusParaLocacao.DISPONIVEL;
//		System.out.println(spl.toString() + " - " + spl.getDisponibilidade());
		//int numSPL = StatusParaLocacao.DISPONIVEL.getNum();
		
//		String i = "DISPONIVEL";
//		
//		StatusParaLocacao y = StatusParaLocacao.valueOf(i);
//		System.out.println(y.getNum()+ " kk");
		
		Cliente cli = new Cliente(34, 27, "lucas de alves", "42176354877", StatusParaLocacao.DISPONIVEL);
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Bicicleta bici = new Bicicleta(9, 24, StatusParaLocacao.DISPONIVEL);
		List<Bicicleta> bike = new ArrayList<Bicicleta>();

		bike.add(0, bici);
		clientes.add(0, cli);
		
		System.out.println(bike.toString());
		System.out.println(bici.getSplBicicleta() + " = " + bici.getSplBicicleta().getDisponibilidade()+"\n\n");
		
		System.out.println(clientes.toString());
		System.out.println(cli.getSpl());
		
		System.out.println("RODOU!");
		
	}

}
