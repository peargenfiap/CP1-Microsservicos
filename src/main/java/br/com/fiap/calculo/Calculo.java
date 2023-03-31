package br.com.fiap.calculo;

import br.com.fiap.model.Viagem;

public class Calculo {

	/** Variável estática para armazenar o valor de minutos em 1 hora. */
	public static final int HOUR_IN_MINUTOS = 60;
	
	/**
	 * @description - Realiza o calculo do delta T -> distancia / velocidade média
	 * @param viagem objeto viagem que contem os valores necessários para o calcul.
	 * @return deltaT
	 */ 	
	public double calculaPrevisaoChegada(Viagem viagem) {
		double deltaT = 0;
		deltaT = viagem.getDistancia() / viagem.getVelocidadeMedia();
		
		return deltaT;
	}
	
	/**
	 * @description realiza a extração do valor das horas à partir do valor do delta T.
	 * @param deltaT
	 * @return apenas o valor da hora.
	 */
	public int extrairHora(double deltaT) {
		return (int) deltaT;
	}

	/**
	 * @description realiza a extração do valor dos minutos à partir do valor do delta T.
	 * @param deltaT
	 * @return apenas o valor de minutos.
	 */
	public int extrairMinuto(double deltaT, int hora) {
		return (int) ((deltaT - hora) * HOUR_IN_MINUTOS);
	}
	
	/**
	 * @description formata a hora e o minuto formatada;
	 * @param deltaT
	 * @return hora e minuto formatado.
	 */
	public String formatarHoras(double deltaT) {
		String formatHourAndMinutes = "";

		int hora = this.extrairHora(deltaT);
		int minutos = this.extrairMinuto(deltaT, hora);
		
		if (hora > 0) formatHourAndMinutes += hora + "h ";

		if (minutos > 0) formatHourAndMinutes += minutos + "m ";

		return formatHourAndMinutes;
	}
	
}
