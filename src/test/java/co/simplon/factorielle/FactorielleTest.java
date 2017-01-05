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
	
	@Test
	public void factorielle_de_2_doit_renvoyer_2() {
		Factorielle f = new Factorielle();
		
		long resultat = f.calculer(2);
		
		assertEquals(2, resultat);
	}
	
	@Test
	public void factorielle_de_3_doit_renvoyer_6() {
		Factorielle f = new Factorielle();
		
		assertEquals(6, f.calculer(3));
	}
	
	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000() {
		assertEquals(6402373705728000l, new Factorielle().calculer(18));
	}
	
	@Test
	public void factorielle_de_0_doit_renvoyer_1() {
		assertEquals(1, new Factorielle().calculer(0));
	}

}
