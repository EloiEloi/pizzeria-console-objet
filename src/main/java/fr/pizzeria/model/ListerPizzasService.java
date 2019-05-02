/**
 * 
 */
package fr.pizzeria.model;

import java.util.List;
import java.util.Scanner;

/**
 * @author Eloi
 *
 */
public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao dao) {
		System.out.println("Liste des pizzas :");
		// on affiche la liste des pizzas
		List<Pizza> listTemp = dao.findAllPizzas();
		for (int i = 0; i < listTemp.size(); i++) {
			System.out.println(listTemp.get(i).toString());

		}

	}

}
