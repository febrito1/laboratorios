package sp2fy;

import java.util.ArrayList;

public class Album {
	
	private String tituloAlbum, artista;
	private int anoLancamento;
	private boolean isFavorito;
	private int duracaoTotal;
	private ArrayList <Musica> musicas;
	private boolean favorito;
	
	
	
	public Album(String artista,String tituloAlbum,int anoLancamento, boolean favorito) throws Exception{
		this(artista, tituloAlbum, anoLancamento);
		musicas = new ArrayList <Musica> ();
	}
	
	
	public Album(String artista,  String tituloAlbum, int anoLancamento) throws Exception{
		
		if (artista == null || artista.trim().isEmpty()){
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
	
		if (anoLancamento <= 1900){
			throw new Exception("Ano de lancamento nao pode ser igual ou inferior a 1900.");
		}
		
		musicas = new ArrayList <Musica> ();
		this.artista = artista;
		this.tituloAlbum = tituloAlbum;
		this.anoLancamento = anoLancamento;
		this.favorito = false;
		
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
		
		if (obj instanceof Album){
			return false;
		}
		Album other = (Album)obj;
		
		if (!this.getTitulo().equals(other.getArtista())){
			return false;
		
		} else if (!this.getArtista().equals(other.getArtista())){
			return false;
		}
		
		return true;
	}

}