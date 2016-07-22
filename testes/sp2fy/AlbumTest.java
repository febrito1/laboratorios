package sp2fy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlbumTest {

	private Album theWall;
	private Album darkSide;
	private Album turnBlue;
	private Album albumTeste;
	private Album darkSideRemastered;

	@Before
	public void setUp() {
		try {
			theWall = new Album("Pink Floyd", "The Wall", 1982);
			darkSide = new Album("Pink Floyd", "The Dark Side of The Moon",
					1973);
			turnBlue = new Album("The Black Keys", "Turn Blue", 2011, true);
			albumTeste = new Album("Eu", "", 1901, true);
			darkSideRemastered = new Album("Pink Floyd",
					"The Dark Side of The Moon", 1973);
		} catch (Exception e) {
			fail("Nao deveria ter ocorrido nenhum erro.");
		}
	}

	@Test
	public void testAlbum() {

		assertEquals("Pink Floyd", theWall.getArtista());
		assertEquals("The Dark Side of The Moon", darkSide.getTitulo());
		assertEquals(true, turnBlue.isFavorito());
		assertEquals(false, darkSide.isFavorito());

		assertEquals(darkSide, darkSideRemastered);
		assertTrue(darkSide.equals(darkSideRemastered));
		assertFalse(darkSide.equals(theWall));

		darkSide.setFavorito(true);
		assertTrue(darkSide.isFavorito());

	}

	@Test
	public void testAdicaoRemocao() {
		try {		

			turnBlue.addMusica("Weight of Love", 4, "Alternativo");
			turnBlue.addMusica("Turn Blue", 3, "Alternativo");
			assertEquals(7, turnBlue.getDuracao());

			turnBlue.removeMusica("Turn Blue");
			assertEquals(4, turnBlue.getDuracao());

			turnBlue.addMusica("Fever", 4, "Alternativo");
			assertEquals(turnBlue.getMusica("Fever"), turnBlue.getMusica(2));
			assertTrue(turnBlue.removeMusica("Weight of Love"));
			assertEquals(turnBlue.getMusica("Fever"), turnBlue.getMusica(1));

		} catch (Exception e) {
			fail("Nao deveria ter ocorrido nenhum erro.");
		}
	}

	@Test
	public void testEquals() {
		try {
			Album theWall = new Album("Pink Floyd", "The Wall", 1982);
			Album darkSide = new Album("Pink Floyd",
					"The Dark Side of The Moon", 1973);

			assertEquals(theWall, new Album("Pink Floyd", "The Wall", 1982));
			assertEquals(theWall, new Album("Pink Floyd", "The Wall", 1901));
			assertNotEquals(darkSide, new Album("Pink Floyd",
					"Dark Side of The Moon", 1973));

		} catch (Exception e) {
			fail("Nao deveria ter ocorrido nenhum erro.");
		}
	}

	@Test
	public void testAlbumInvalido() {
		try {
			Album theWall = new Album("  ", "The Wall", 1982);
			fail();
			
		} catch (Exception e) {
			assertEquals("Artista do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}
		try {
			Album darkSide = new Album(null, "The Dark Side of The Moon", 1973);
			fail();
			
		} catch (Exception e) {
			assertEquals("Artista do album nao pode ser nulo ou vazio.",
					e.getMessage());
		}
		try {
			Album albumTeste = new Album("Eu", "Album Teste", 1900, true);
			fail();
			
		} catch (Exception e) {
			assertEquals(
					"Ano de lancamento nao pode ser igual ou inferior a 1900.",
					e.getMessage());
		}
		try {
			Album albumTeste = new Album("Eu", "Album Teste", -22, true);
			fail();
			
		} catch (Exception e) {
			assertEquals(
					"Ano de lancamento nao pode ser igual ou inferior a 1900.",
					e.getMessage());
		}
	}
	
	@Test
	public void testToString() {
		try{
			turnBlue.addMusica("Wight of Love", 6, "Pop-Rock");
			turnBlue.addMusica("In Time", 3	, "Pop-Rock");
			turnBlue.addMusica("Fever", 5, "Pop-Rock");			
			albumTeste.addMusica("Meu Teste", 1, "Teste");
			albumTeste.addMusica("Meu teste live", 2, "Teste");
			
			assertEquals("Artista: The Black Keys - Titulo: Turn Blue - Ano: 2011", turnBlue.toString());
			assertEquals("Artista: Eu - Titulo:  - Ano: 1901", albumTeste.toString());
		} catch(Exception e){
			fail("Nao deveria ter ocorrido nenhum erro");
		}
		
	}
}
