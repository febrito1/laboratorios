package joguinhoRPG;

import java.util.ArrayList;

public class Heroi {
	
	private ArrayList <Heroi> listaherois;
	private String nomeHeroi;
	private double pesoMochila;
	private int vidaHeroi = 100;
	private int danocausado = 0;
	private int curafeita = 0;
	
	
	
	public Heroi(String nomeHeroi, double pesoMochila){
		
		
		this.nomeHeroi = nomeHeroi;
		this.pesoMochila = pesoMochila;
		
		
		
		Heroi heroi = new Heroi(nomeHeroi, pesoMochila);
		armazenaHeroi(heroi);
		
	}

	
	public boolean criaItem(String nome, double peso, int efeito, String tipo){
		
		if (peso < getPesoMochila()){
			
			Item novoItem = new Item(nome, peso, efeito, tipo);
			
			if (tipo.equals("Arma")){
				
				this.danocausado += efeito;
			
			}else if(tipo.equals("Pocao")){
				
				this.curafeita += efeito;
			}
			
			return true;
		
		}
		
		return false;
		
	}
	

	public void armazenaHeroi(Heroi heroi){
		
		Heroi heroi1 = new Heroi(nomeHeroi, vidaHeroi);
		listaherois.add(heroi);
		
		
	}


	public String getNomeHeroi() {
		return nomeHeroi;
	}


	public void setNomeHeroi(String nomeHeroi) {
		this.nomeHeroi = nomeHeroi;
	}


	public double getPesoMochila() {
		return pesoMochila;
	}


	public void setPesoMochila(double pesoMochila) {
		this.pesoMochila = pesoMochila;
	}


	public int getVidaHeroi() {
		return vidaHeroi;
	}


	public void setVidaHeroi(int vidaHeroi) {
		this.vidaHeroi = vidaHeroi;
	}


	@Override
	public String toString() {
		return "Heroi [nomeHeroi=" + nomeHeroi + ", pesoMochila=" + pesoMochila
				+ "]";
	}

}
	