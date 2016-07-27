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
		return "Nome do Exercicio = " + nomeExercicio + ", Numero de Calorias = "
				+ numCalorias + ".";
				
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeExercicio == null) ? 0 : nomeExercicio.hashCode());
		result = prime * result + numCalorias;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercicio other = (Exercicio) obj;
		if (nomeExercicio == null) {
			if (other.nomeExercicio != null)
				return false;
		} else if (!nomeExercicio.equals(other.nomeExercicio))
			return false;
		if (numCalorias != other.numCalorias)
			return false;
		return true;
	}
	
	
	
	
	
	
}
