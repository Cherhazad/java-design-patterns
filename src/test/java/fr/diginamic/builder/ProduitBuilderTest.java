package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import fr.diginamic.factory.Enums.Unite;

public class ProduitBuilderTest {
	
	private Produit produit;

//	@Before
//	public void setUp() {
//		// Initialisation des objets avant chaque test
//		categorie1 = new Categorie("Détergent");
//		marque1 = new Marque("Briochin");
//		ingredient1 = new Ingredient("oeuf", 55.5, Unite.GRAMME);
//
//		builder = new ProduitBuilder();
//		builder = builder.appendNom("Vinaigre blanc").appendGrade("A+").appendCategorie(categorie1)
//				.appendMarque(marque1).appendUnIngredient(ingredient1);
//
//		produit = builder.assemble();
//
//	}

	@Test
	public void testProduitBuilder() {
		ProduitBuilder builder = new ProduitBuilder("Yaourt aux fraises");
		try {
			builder.appendCategorie("Produits laitiers").appendMarque("Yop").appendIngredient("Lait", 100, Unite.GRAMME).assemble();
			assertNotNull(produit);
			assertEquals("Yaourt aux fraises", produit.getNom());
//			assertEquals("A+", produit.getGrade());
			assertEquals("Produits laitiers", produit.getCategorie());
			assertEquals("Yop", produit.getMarque());
//			assertTrue(produit.getIngredients().contains(ingredient1));
		} catch (ProduitException e) {
			fail("Test en échec");
		}

	}

	@Test
	public void testAppendCategorie() {
		ProduitBuilder builder = new ProduitBuilder("Yaourt aux fraises");
		try {
			Produit produit = builder.appendCategorie("Produits laitiers").appendMarque("Yop").appendIngredient("Lait", 100, Unite.GRAMME).assemble();
			assertEquals("Produits laitiers", produit.getCategorie().getNom());
		} catch (ProduitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testAppendGrade() {
		assertEquals(produit.getGrade(), "A+");
	}

	@Test
	public void testAppendMarque() {
		assertEquals(produit.getMarque(), "Yop");
	}

	@Test
	public void testAppendIngredient() {
		assertEquals(produit.getIngredients().get(0).getNom(), "Lait");
	}


	@Test
	public void testAppendAllergene() {
		
	}

	@Test
	public void testAppendAdditif() {
		assertEquals(produit.getAdditif(), null);
	}


}
