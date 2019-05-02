/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author Eloi
 *
 */
public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {

		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		dao.deletePizza(scanner.nextLine());
	}

}
