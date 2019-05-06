/**
 * 
 */
package fr.pizzeria.exception;

/**
 * @author Eloi
 *
 *         class gerant les exceptions concernant la modification des pizzas dans la Classe ModifierPizzaService
 */
public class UpdatePizzaException extends StockageException {

	/**
	 * Constructor
	 * 
	 */
	public UpdatePizzaException() {
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 */
	public UpdatePizzaException(String message) {
		super(message);
	}
}
