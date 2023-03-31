package br.com.fiap.model;

public class Viagem {

	private double distancia;
	private double velocidadeMedia;
	private String prevChegada;

	public Viagem() { }
	
	public Viagem(double distancia, double velocidadeMedia) {
		super();
		this.distancia = distancia;
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getPrevChegada() {
		return prevChegada;
	}

	public void setPrevChegada(String prevChegada) {
		this.prevChegada = prevChegada;
	}
	
}
