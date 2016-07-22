package sp2fy;

import java.util.ArrayList;

public class Album {
	
	private String tituloAlbum, artista;
	private int anoLancamento;
	private boolean isFavorito;
	private int duracaoTotal;
	private ArrayList <Musica> musicas;
	
	
	
	public Album(String tituloAlbum, String artista, int anoLancamento) throws Exception{
		this(tituloAlbum,artista,anoLancamento, false);
		musicas = new ArrayList <Musica> ();
	}
	
	
	public Album(String tituloAlbum, String artista, int anoLancamento, boolean favorito) throws Exception {
		
		if ((tituloAlbum == null) || tituloAlbum.trim().isEmpty()){
			throw new Exception("Titulo do album não pode ser nulo ou vazio.");
		}
		
		if (artista == null || tituloAlbum.trim().isEmpty()){
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
		
		if (anoLancamento <= 1900){
			throw new Exception("Ano de lancamento nao pode ser igual ou inferior a 1900.");
		}
		
		musicas = new ArrayList <Musica> ();
		this.tituloAlbum = tituloAlbum;
		this.artista = artista;
		this.anoLancamento = anoLancamento;
		favorito = isFavorito;
		
	}

	public String getTitulo() {
		return tituloAlbum;
	}

	public String getArtista() {
			return artista;
	}
	
	
	public int getAnoLancamento() {
		return anoLancamento;
	}

	public boolean isFavorito(){
		return isFavorito;
	}

	
	public void setTitulo(String titulo) {
			this.tituloAlbum = titulo;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
	}
	
	public void setFavorito(boolean isFavorito) {
		this.isFavorito = isFavorito;
	}
	
	public boolean addMusica(String nome, int duracao, String genero) throws Exception{
		Musica musica = new Musica(nome, duracao, genero);
		if(!musicas.contains(musica)){
			this.musicas.add(musica);
			duracaoTotal += duracao;
			return true;
		}
		return false;
	}
	
	
	public boolean removeMusica(String nome){
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).equals(nome)){
				musicas.remove(i);
			return true;	
			}
		
		}
		return false;
	}
	
	public boolean getMusica(String nome){
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).equals(nome)){
				return true;
			}

		}
		return false;
	}
	
	
	public boolean getMusica(int posicao){
		musicas.get(posicao + 1);
			return true;
		}
		
	
	public int getDuracao(){
		 return duracaoTotal;
	}

	
	
	@Override
	public String toString() {
		return "Artista: " + getArtista() + " - Titulo: "+ getTitulo() + " - Ano: " + getAnoLancamento();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoLancamento;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + ((tituloAlbum == null) ? 0 : tituloAlbum.hashCode());
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
		Album other = (Album) obj;
		if (anoLancamento != other.anoLancamento)
			return false;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (tituloAlbum == null) {
			if (other.tituloAlbum != null)
				return false;
		} else if (!tituloAlbum.equals(other.tituloAlbum))
			return false;
		return true;
	}

}