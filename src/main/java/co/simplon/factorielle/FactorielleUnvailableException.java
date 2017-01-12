package co.simplon.factorielle;

public class FactorielleUnvailableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FactorielleUnvailableException() {
		super();
	}

	public FactorielleUnvailableException(String messageErreur) {
		super(messageErreur);
	}

}
