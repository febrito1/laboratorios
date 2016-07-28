package prova20152;


public class Exercicio {

	
	
	private String nomeExercicio;
	private int numCalorias; 
	
	
	public Exercicio(String nomeExercicio, int numCalorias){
		
		this.nomeExercicio = nomeExercicio;
		this.numCalorias = numCalorias;
	
		
	}

	
	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public int getNumCalorias() {
		return numCalorias;
	}

	public void setNumCalorias(int numCalorias) {
		this.numCalorias = numCalorias;
	}
	
	
	public int malha(int horas){
	
		int informacaoExercicio;
		informacaoExercicio = getNumCalorias() * horas;
	
	return informacaoExercicio;	
	
	}
	
	@Override
	public String toString() {
		return nomeExercicio + " " + numCalorias;
				
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeExercicio == null) ? 0 : nomeExercicio.hashCode());
		return result;
	}
	
	
}
