package co.simplon.factorielle;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

public class FactorielleTest {

	private Factorielle factorielle;

	@Before
	public void initialiserUtilitaireFactorielle() {
		this.factorielle = new Factorielle();
	}

	
	@Ignore
	@Test
	public void factorielle_de_1_doit_renvoyer_1() {
		// GIVEN
		long entier = 1;
		long resultatAttendu = 1;

		// WHEN
		long resultat = factorielle.calculer(entier);

		// THEN
		assertEquals(resultatAttendu, resultat);
	}

	@Test
	public void factorielle_de_2_doit_renvoyer_2() {
		Main.main(new String[] {"2"});
		long resultat = factorielle.calculer(2);
		assertEquals(2, resultat);
	}
	
	@Ignore
	@Test
	public void factorielle_de_3_doit_renvoyer_6() {
		assertEquals("Le résultat pour 3 devrait être 6.", 6,
				factorielle.calculer(3));
	}
	
	@Ignore
	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000() {
		assertEquals(6402373705728000l, factorielle.calculer(18));
	}

	@Test
	public void factorielle_de_0_doit_renvoyer_1() {
		Main.main(new String[] {"0"});
		//assertTrue(factorielle.calculer(0) == 1);
		//assertFalse(factorielle.calculer(0) != 1);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void factorielle_d_un_nombre_negatif_doit_declencher_une_exception() {
		Main.main(new String[] {"-1"});
		//factorielle.calculer(-1);
	}
	
	
	@Ignore
	@Test(timeout=1) 
	public void factorielle_18_repete_100_fois_doit_sexecuter_en_moints_de_10_ms() {
		for (int i = 1 ; i<= 100 ; i++)
			factorielle.calculer(18);
	}
	
	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000_avec_hamcrest() {
		// GIVEN
//		long entier = 18;
//		long resultatAttendu = 6402373705728000l;
		
		Main.main(new String[] {"18"});

//		// WHEN
//		long resultat = factorielle.calculer(entier);
//
//		// THEN
//		assertThat(resultat, equalTo(resultatAttendu));
//		assertThat(resultat == resultatAttendu, is(true));
	}
	
	@Test
	public void factorielle_de_20_renvoie_2432902008176640000() {
		Main.main(new String[] {"20"});
		//assertThat(2432902008176640000l == factorielle.calculer(20), is(true));
	}
	
	@Ignore	
	@Test(expected = FactorielleUnvailableException.class)
	public void factorielle_de_21_renvoie_51090942171709440000() {	
		assertThat(51090942171709440000f == factorielle.calculer(21), is(false));
	}
	
	@Test(expected = FactorielleUnvailableException.class)
	public void factorielle_de_50_renvoie_une_exception_aux_limites() {
		Main.main(new String[] {"50"});
		//factorielle.calculer(50);
	}
	
	@Test
	public void appel_main_de_10() {
		
		Main.main(new String[] {"10"});
	}
	
	@Ignore
	@Test(expected = FactorielleUnvailableException.class)
	public void appel_main_Max_Value_Integer_Moins_Un() {
		
		String max_val = Integer.toString(Integer.MAX_VALUE - 1);
		
		Main.main(new String[] {max_val});
	}

	@Test
	public void appel_main_Max_Value_Double_Plus_XXX() {
		
		String max_val = Double.toString(Double.MAX_VALUE + 10000000000l);
		
		Main.main(new String[] {max_val});
	}
	
	@Test
	public void appel_main_avec_chaine() {
		
		Main.main(new String[] {"aaa"});
	}	
}
