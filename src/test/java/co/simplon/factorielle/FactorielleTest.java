package co.simplon.factorielle;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FactorielleTest {

	private Factorielle factorielle;

	@Before
	public void initialiserUtilitaireFactorielle() {
		this.factorielle = new Factorielle();
	}

	@Test
	public void factorielle_de_1_doit_renvoyer_1() throws FactorielleUnvailableException {
		// GIVEN
		long entier = 1;
		long resultatAttendu = 1;

		// WHEN
		long resultat = factorielle.calculer(entier);

		// THEN
		assertEquals(resultatAttendu, resultat);
	}

	@Test
	public void factorielle_de_2_doit_renvoyer_2() throws FactorielleUnvailableException {
		long resultat = factorielle.calculer(2);

		assertEquals(2, resultat);
	}

	@Test
	public void factorielle_de_3_doit_renvoyer_6() throws FactorielleUnvailableException {
		assertEquals("Le résultat pour 3 devrait être 6.", 6,
				factorielle.calculer(3));
	}

	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000() throws FactorielleUnvailableException {
		assertEquals(6402373705728000l, factorielle.calculer(18));
	}

	@Test
	public void factorielle_de_0_doit_renvoyer_1() throws FactorielleUnvailableException {

		assertTrue(factorielle.calculer(0) == 1);
		assertFalse(factorielle.calculer(0) != 1);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void factorielle_d_un_nombre_negatif_doit_declencher_une_exception() throws FactorielleUnvailableException {
		factorielle.calculer(-1);
	}
	
	@Test(timeout=1) 
	public void factorielle_18_repete_100_fois_doit_sexecuter_en_moints_de_10_ms() throws FactorielleUnvailableException {
		for (int i = 1 ; i<= 100 ; i++)
			factorielle.calculer(18);
	}
	
	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000_avec_hamcrest() throws FactorielleUnvailableException {
		// GIVEN
		long entier = 18;
		long resultatAttendu = 6402373705728000l;

		// WHEN
		long resultat = factorielle.calculer(entier);

		// THEN
		assertThat(resultat, equalTo(resultatAttendu));
		assertThat(resultat == resultatAttendu, is(true));
	}
	
	@Test
	public void factorielle_de_20_renvoie_2432902008176640000() throws FactorielleUnvailableException {
		
		assertThat(2432902008176640000l == factorielle.calculer(20), is(true));

	}
	
	@Test(expected = FactorielleUnvailableException.class)
	public void factorielle_de_21_renvoie_51090942171709440000() throws FactorielleUnvailableException {
		
		assertThat(51090942171709440000f == factorielle.calculer(21), is(false));

	}
	
	@Test(expected = FactorielleUnvailableException.class)
	public void factorielle_de_50_renvoie_une_exception_aux_limites() throws FactorielleUnvailableException {
		
		factorielle.calculer(50);
		

	}

}
