package lp2.lab04;

import java.util.ArrayList;


public class Album {

	private String nome;
	private String tituloAlbum;
	private int anoLancamento;
	
	private ArrayList<Musica> listaMusicas;
	
	
	
	
	public Album(String nome, String tituloAlbum, int anoLancamento)throws Exception{
		
		if (anoLancamento < 1900){
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");
		}
		
		if (nome == null || nome.trim().isEmpty()){
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
		
		if(tituloAlbum == null || tituloAlbum.trim().isEmpty()){
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");
		}
	
		this.nome = nome;
		this.tituloAlbum = tituloAlbum;
		this.anoLancamento = anoLancamento;
	
		
		
		listaMusicas = new ArrayList<Musica>();
	
	}
	
	
	public boolean adicionaMusica(Musica musica){
		if (musica != null){
			listaMusicas.add(musica);
			return true;
		}
		
		return false;	
	}
	
	
}
