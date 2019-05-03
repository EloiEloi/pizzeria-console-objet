/**
 * 
 */
package fr.pizzeria.exception;

/**
 * @author Eloi
 * 
 *         exception
 *
 */
public class DeletePizzaException extends StockageException {

	/**
	 * Constructor
	 * 
	 */
	public DeletePizzaException() {
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public DeletePizzaException(String message) {
		super(message);
	}

}
