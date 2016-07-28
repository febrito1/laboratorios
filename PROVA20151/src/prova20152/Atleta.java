package prova20152;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Atleta {
	
	private String nome, sexo; 
	private double altura;
	private int peso;
	private ArrayList<Exercicio> listaExercicios;
	private int variavelControle = 0;
	private Exercicio exercicio;
	public int TotalCalorias = 0 ;

	public Atleta(String nomeAtleta, double altura, int peso, String sexo){
		
		this.nome = nomeAtleta;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		
		
		listaExercicios = new ArrayList<Exercicio>();
		
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public double getAltura() {
		return altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

public boolean adicionaExercicio(String nome, int calorias){
		
		if (listaExercicios.size() < 3 && isIgual(nome) == false){
			
			Exercicio programaExercicio = new Exercicio(nome, calorias);
			
			
			TotalCalorias += calorias;
			
			listaExercicios.add(programaExercicio);
			
			
			System.out.println(listaExercicios);	
			
			return true;
		
		
		}
		return false;
	}
	
	
	public boolean isIgual(String nome){	
		
		for (int i = 0; i < variavelControle; i++) {
			
			if (listaExercicios.get(i).getNomeExercicio().equals(nome)){
		
				return true;
			}
		}
		
		variavelControle += 1;
		
		return false;
	}
	
	
	public int malha(int horas){
		
		return TotalCalorias * horas;	
	
	}
	
	
	public String calculaIMC(){
		
		double imc = getPeso()/(getAltura()*2);
		sexo = getSexo();
		System.out.println(imc);
		if (sexo.equals("Feminino")){
			if (imc > 0 && imc <=19.1){
				return "Abaixo do peso.";
			}else if(imc > 19.1 && imc < 32.3){
				return "Peso Intermediário";
			}else if (imc >= 32.3){
				return "Obeso";
			}
		}else{
			if(imc > 0 && imc <=19.1){
				return "Abaixo do peso.";
			}else if (imc >19.1 && imc < 32.3){
				return "Peso Intermediário";
			}else if (imc >= 32.3){
				return "Obeso";
			}
		}
		return "";
	}

	
	public String toString() {
		String a =  "Atleta: <" + nome + "> ; Peso: < " + peso + "> ; Altura: <" + altura + "> \n "
				+ "Programa de Exercícios: \n" + listaExercicios;
		return a;
		}
	}

	
	
	
