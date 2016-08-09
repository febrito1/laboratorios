package hotel;

import java.util.ArrayList;


public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	private double lucroTotal = 0;
	
	public Recepcao(){
		estadias = new ArrayList<Estadia>();
	}


	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception{
		
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
		lucroTotal += valor;
	}
	
	public void checkOut(String nome){
		for (int i = 0; i < estadias.size(); i++) {
			if (nome.equalsIgnoreCase(estadias.get(i).getNome())){
				estadias.remove(i);
			}
		}
	}


	public int getNumDeHospedes(){
		return estadias.size();
	}


	public double getLucroTotal(){
		return lucroTotal;
	}


	@Override
	public String toString() {
		String concatena = "";
		
		for (int j = 0; j < estadias.size(); j++) {
			concatena += estadias.get(j).getNome() + " (" + estadias.get(j).getTipo() + "):" + estadias.get(j).getQtdDias() + " dias com o preço de R$ " + estadias.get(j).getValor() + "/n";
		}
		return concatena;	
	}

	
	
}
