/**
 * 
 */
package fr.pizzeria.exception;

/**
 * @author Eloi
 *
 */
public class SavePizzaException extends StockageException {

	public SavePizzaException() {
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public SavePizzaException(String message) {
		super(message);
	}

}
