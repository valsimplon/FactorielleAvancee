package co.simplon.factorielle;

public class Main {

	public static void main(String[] args) {

		try {
			long entier = Long.parseLong(args[0]);
			calculeEtAfficheFactorielle(entier);
		} catch (NumberFormatException errFormat) {
			System.out.println(" Cas erreur 2 : probleme de format " + errFormat.getMessage());
		} catch (ArrayIndexOutOfBoundsException errAucunArgument) {
			System.out.println(" Cas erreur 5 : Aucun argument");
		} catch (FactorielleUnvailableException errFactorielle) {
			System.out.println(("cas erreur 3 : La limite de calcul factoriel atteinte"));
		} catch (IllegalArgumentException errArg) {
			System.out.println("cas erreur 4 : l'erreur est un argumement invalide");
		}
	}

	private static void calculeEtAfficheFactorielle(long entier) {
		Factorielle factorielle = new Factorielle();
		long factorielleCalculee = factorielle.calculer(entier);
		System.out.println("cas passant - le résultat attendu est " + factorielleCalculee);
	}

}