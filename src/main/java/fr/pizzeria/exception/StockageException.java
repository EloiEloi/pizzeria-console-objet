/**
 * 
 */
package fr.pizzeria.exception;

/**
 * @author Eloi
 *
 *         Class mère des exceptions
 *
 */
public class StockageException extends Exception {

	/**
	 * Constructor
	 * 
	 */
	public StockageException() {

	}

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public StockageException(String message) {
		super(message);
	}

}
