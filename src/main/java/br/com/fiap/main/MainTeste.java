package br.com.fiap.main;

import br.com.fiap.calculo.Calculo;
import br.com.fiap.model.Viagem;

public class MainTeste {

	/** Classe criada apenas para realizar os testes. */
	public static void main(String[] args) {
		executeTest();
	}
	
	/**
	 * @description realiza a chamada dos métodos desenvolvidos para avialiação.
	 */
	public static void executeTest() {
		Calculo calculo = new Calculo();
		Viagem viagem = new Viagem(160, 100);
		
		double detaT = calculo.calculaPrevisaoChegada(viagem);
		
		String previsaoChegada = calculo.formatarHoras(detaT);
		viagem.setPrevChegada(previsaoChegada);
		System.out.println(previsaoChegada);
	}
	
}
