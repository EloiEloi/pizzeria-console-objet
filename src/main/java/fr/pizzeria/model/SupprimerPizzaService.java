/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

/**
 * @author Eloi
 *
 *         class représentant le cas utilisation : 4 , suppression d'une pizza
 *
 */
public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {

		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		// on applle la méthode sur "dao", qui supprime de la liste de pizza,
		// la pizza selectionnée par l'utilisateur via le scanner
		dao.deletePizza(scanner.nextLine());
	}

}
