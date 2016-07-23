package sp2fy;

public class Main {

	public static void main(String[] args) {
		try {
			Album album = new Album("","XABLAU",2010);
			System.out.println(album.getArtista());
			System.out.println(album.getAnoLancamento());
		}catch(Exception e){
			e.getMessage();
		}
		
	}

}