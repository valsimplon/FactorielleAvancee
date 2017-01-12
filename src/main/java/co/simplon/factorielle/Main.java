package co.simplon.factorielle;

import static java.lang.System.exit;

public class Main {

	public static void main(String[] args) {

		long factorielleCalculee = 0;
		Factorielle factorielle = new Factorielle();
		long entier = 0; // "17916881237904312345"

		try {
			entier = Long.parseLong(args[0]);
		} catch (NumberFormatException errFormat) {
			System.out.println("probleme de format " + errFormat.getMessage());
			exit(2);
		}

		try {
			factorielleCalculee = factorielle.calculer(entier);
			System.out
					.println("le résultat attendu est " + factorielleCalculee);
		} catch (FactorielleUnvailableException errFactorielle) {
			System.out.println(("La limite de calcul factoriel atteinte"));
			exit(3);
		} catch (IllegalArgumentException errArg) {
			System.out.println("l'erreur est un argumement invalide");
			exit(4);
		}
	}

}