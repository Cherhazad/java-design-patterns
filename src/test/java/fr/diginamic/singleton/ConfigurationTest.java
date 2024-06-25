package fr.diginamic.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testGetInstance() {
		Configuration config = Configuration.getInstance();
		assertNotNull(config);
	}

	@Test
	public void testGetValeur() {
		String valeur = Configuration.getInstance().getValeur("db.password");
		assertNotNull(valeur);
		assertEquals("1234", valeur);
	}

	@Test
	public void testGetValeurInexistante() {
		String valeur = Configuration.getInstance().getValeur("db.passwords");
		assertNull(valeur);
	}

}
