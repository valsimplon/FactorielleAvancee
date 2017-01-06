package co.simplon.factorielle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {

	private Factorielle factorielle;

	@Before
	public void initialiserUtilitaireFactorielle() {
		// je peux faire ca car mon objet peut être mutualisé pour tous les
		// scénarios de test et n'a donc besoin d'être instancié qu'une fois
		this.factorielle = new Factorielle();
	}

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
		long resultat = factorielle.calculer(2);

		assertEquals(2, resultat);
	}

	@Test
	public void factorielle_de_3_doit_renvoyer_6() {
		// Si le test échoue, je peux afficher un message personnalisé
		assertEquals("Le résultat pour 3 devrait être 6.", 6,
				factorielle.calculer(3));
	}

	@Test
	public void factorielle_de_18_doit_renvoyer_6402373705728000() {
		assertEquals(6402373705728000l, factorielle.calculer(18));
	}

	@Test
	public void factorielle_de_0_doit_renvoyer_1() {
		// si le test ne passe pas, je n'ai pas de message clair m'indiquant ce
		// qui était attendu et ce qui a été évalué
		assertTrue(factorielle.calculer(0) == 1);
	}

	@Ignore("test incomplet")
	@Test
	public void test_en_cours_de_construction() {
		// je verrais ca demain
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void factorielle_d_un_nombre_negatif_doit_declencher_une_exception() {
		factorielle.calculer(-1);
	}

}
