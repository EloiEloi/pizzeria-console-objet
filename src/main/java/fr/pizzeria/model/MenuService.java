/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author Eloi
 *
 */
public abstract class MenuService {

	public abstract void executeUC(Scanner scanner, PizzaMemDao dao);

}
