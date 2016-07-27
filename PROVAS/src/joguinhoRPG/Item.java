package joguinhoRPG;

public class Item {

	
	private String nome, tipo;
	private double peso;
	private int efeito;
	
	
	public Item(String nome, double peso, int efeito, String tipo){
		
		this.nome = nome;
		this.peso = peso;
		this.efeito = efeito;
		this.tipo = tipo;
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getEfeito() {
		return efeito;
	}


	public void setEfeito(int efeito) {
		this.efeito = efeito;
	}


	

}
