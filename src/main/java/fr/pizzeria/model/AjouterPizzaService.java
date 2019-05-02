package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author Eloi
 * 
 *         class représentant le cas utilisation : 2 , ajout d'une pizza
 *
 */
public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		String valeur = "";

		System.out.println("Veuillez saisir le code :");
		valeur = scanner.nextLine();
		String monCode = valeur;

		System.out.println("Veuillez saisir le nom (sans espace) :");
		valeur = scanner.nextLine();
		String monLibelle = valeur;

		System.out.println("Veuillez saisir le prix :");
		valeur = scanner.nextLine();
		Double monPrix = Double.parseDouble(valeur);

		dao.saveNewPizza(new Pizza(monCode, monLibelle, monPrix));

	}

}
