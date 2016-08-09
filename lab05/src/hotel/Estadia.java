package hotel;

public class Estadia {
	
	private Animal animal;
	
	private String nome;
	private String tipo;
	private int idade;
	private double valor;
	private int qtdDias;
	
	public Estadia(String nome, String tipo, int idade, int qtdDias, double valor) throws Exception{
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.qtdDias = qtdDias;
		this.valor = valor;
		
		Animal animal = new Animal(nome,tipo,idade);
	}
	
	

	public String getNome() {
		return animal.getNome();
	}

	public void setNome(String nome) {
		animal.setNome(nome);
	}
	public String getTipo() {
		return animal.getTipo();
	}
	public void setTipo(String tipo) {
		animal.setTipo(tipo);
	}
	public int getIdade() {
		return animal.getIdade();
	}
	public void setIdade(int idade) {
		animal.setIdade(idade);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	
	public String toString(){
		String saida = this.nome+", " + this.tipo+", "+ this.qtdDias + " dias com o preço de R$ " +this.valor;
		return saida;
	}
}
	
