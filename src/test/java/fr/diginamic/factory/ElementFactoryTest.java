package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.factory.Enums.TypeElement;
import fr.diginamic.factory.Enums.Unite;

public class ElementFactoryTest {

	private static final double precision = 0.000000001;

	// On teste tous les types d'éléments au cas où on utilise des plugins qui
	// mesurent la couverture des tests, afin qu'ils soient complets

	// On pourrait tester les autres paramètres de getInstance comme s'assurer que
	// le nom ait au moins 2 caractères ou bien que la valeur soit positive, etc. Il
	// faudrait rajouter des contrôles dans ces cas

	@Test
	public void testGetInstance1() {
		ElementFactory factory = new ElementFactory();
		Element elt = factory.getInstance(TypeElement.INGREDIENT, "Sucre", 100, Unite.GRAMME);

		assertNotNull(elt);
		assertEquals(Ingredient.class, elt.getClass());
		assertTrue(elt instanceof Ingredient);

		assertEquals(elt.getNom(), "Sucre");
		assertEquals(elt.getValeur(), 100, precision); // mettre ce 3ème paramètre pour les problèmes d'arrondis
		assertEquals(elt.getUnite(), Unite.GRAMME);

	}

	@Test
	public void testGetInstance2() {
		ElementFactory factory = new ElementFactory();
		Element elt = factory.getInstance(TypeElement.ALLERGENE, "Gluten", 40, Unite.MILLI_GRAMMES);

		assertNotNull(elt);
		assertEquals(Allergene.class, elt.getClass());
		assertTrue(elt instanceof Allergene);

		assertEquals(elt.getNom(), "Gluten");
		assertEquals(elt.getValeur(), 40, precision);
		assertEquals(elt.getUnite(), Unite.MILLI_GRAMMES);

	}

	@Test
	public void testGetInstance3() {
		ElementFactory factory = new ElementFactory();
		Element elt = factory.getInstance(TypeElement.ADDITIF, "E121", 10, Unite.MICRO_GRAMMES);

		assertNotNull(elt);
		assertEquals(Additif.class, elt.getClass());
		assertTrue(elt instanceof Additif);

		assertEquals(elt.getNom(), "E121");
		assertEquals(elt.getValeur(), 10, precision);
		assertEquals(elt.getUnite(), Unite.MICRO_GRAMMES);

	}

	@Test
	public void testGetInstanceNull() {
		ElementFactory factory = new ElementFactory();
		Element elt = factory.getInstance(null, "E121", 10, Unite.MICRO_GRAMMES);

		assertNull(elt);
		assertTrue(elt == null);
	}

}
