package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.factory.Enums.TypeElement;
import fr.diginamic.factory.Enums.Unite;

public class ElementFactoryTest {

	private static final double precision = 0.000000001;

	@Test
	public void testGetInstanceElement() {
		Element elt = ElementFactory.getInstanceElement(TypeElement.INGREDIENT, "Sucre", 100, Unite.GRAMME);
		assertNotNull(elt);
		assertEquals(Ingredient.class, elt.getClass());
		assertTrue(elt instanceof Ingredient);
		
		assertEquals(elt.getNom(), "Sucre");
		assertEquals(elt.getValeur(), 40.0, precision); // mettre ce 3ème paramètre pour les problèmes d'arrondis
		assertEquals(elt.getUnite(), Unite.MILLI_GRAMMES);
		
	}
	
	@Test
	public void testGetInstanceNull() {
		ElementFactory factory = new ElementFactory();
		Element elt = factory.getInstanceElement(null,  , 0, null);
		assertNull(elt);
		assertTrue(elt == null);
	}

}
