package co.simplon.factorielle;

import java.lang.Math.*;
/**
 * Factorielle
 */
public class Factorielle {

    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    	
    	if (n > 1) {
			long fact = calculer(n-1);
			long factn = n*fact;
			
			if (factn < fact) {
				throw new FactorielleUnvailableException("La limite de calcul factoriel atteinte");
			}
			return factn;
			
		} else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1;
    }

    public long conversion(String nombre) {
    	
    	long resultatEntier = 0; //"17916881237904312345"
    	
    	try {
    		
    		resultatEntier = Long.parseLong(nombre);
        	
    	} catch (NumberFormatException errFormat) {
    		
    		System.out.println("probleme de format " + errFormat.getMessage());
    	
    	}
    
    	return resultatEntier;
	}
     
}
