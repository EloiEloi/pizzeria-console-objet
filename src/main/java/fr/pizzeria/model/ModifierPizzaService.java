/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author Eloi
 *
 *         class représentant le cas utilisation : 3 , modifier une pizza
 *
 */
public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		String valeur = "";

		System.out.println("----- Liste des pizzas -----");

		System.out.println("Veuillez choisir le code de la pizza à modifier");
		valeur = scanner.nextLine();
		String monCodePizzaAModifier = valeur;

		System.out.println("Veuillez saisir le nouveau code :");
		valeur = scanner.nextLine();
		String monCode = valeur;

		System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
		valeur = scanner.nextLine();
		String monLibelle = valeur;

		System.out.println("Veuillez saisir le nouveau prix :");
		valeur = scanner.nextLine();
		Double monPrix = Double.parseDouble(valeur);

		Pizza pizzaTemp = new Pizza(monCode, monLibelle, monPrix);

		dao.updatePizza(monCodePizzaAModifier, pizzaTemp);
	}

}
