package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void factorielle_de_1_doit_renvoyer_1() {
		// GIVEN
		long entier = 1;
		long resultatAttendu = 1;
		Factorielle f = new Factorielle();
		
		// WHEN
		long resultat = f.calculer(entier);
		
		// THEN
		assertEquals(resultatAttendu, resultat);
	}

}
