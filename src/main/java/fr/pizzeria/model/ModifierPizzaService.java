/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import fr.pizzeria.exception.UpdatePizzaException;

/**
 * @author Eloi
 *
 *         class représentant le cas utilisation : 3 , modifier une pizza
 *
 */
public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws UpdatePizzaException {

		String valeur = "";

		System.out.println("----- Liste des pizzas -----");

		System.out.println("Veuillez choisir le code de la pizza à modifier");
		valeur = scanner.nextLine();// assigne la saisie utilisateur à la variable "valeur"
		String monCodePizzaAModifier = valeur;

		System.out.println("Veuillez saisir le nouveau code :");
		valeur = scanner.nextLine();// assigne la saisie utilisateur à la variable "valeur"
		String monCode = valeur;

		System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
		valeur = scanner.nextLine();// assigne la saisie utilisateur à la variable "valeur"
		String monLibelle = valeur;

		System.out.println("Veuillez saisir le nouveau prix :");
		valeur = scanner.nextLine(); // assigne la saisie utilisateur à la variable "valeur"
		Double monPrix = null;
		// on test si la valeur entrée est bien un nombre
		if (NumberUtils.isCreatable(valeur)) {
			// si oui, on transforme le string en double
			monPrix = Double.parseDouble(valeur);
		} else {
			monPrix = null;
		}

		String monPrixEnString = valeur;

		if (monCodePizzaAModifier.equals("")) {
			throw new UpdatePizzaException("le code pizza n'est pas correct");

		} else if (monCode.equals("")) {
			throw new UpdatePizzaException("Le nouveau code n'est pas correct");

		} else if (monLibelle.equals("") || monLibelle.equals("0")) {
			throw new UpdatePizzaException("Le nouveau libellé n'est pas correct");

		} else if (monPrix.equals("0")) {
			throw new UpdatePizzaException("Le nouveau prix ne peut pas valoir : 0 ");

		} else if (monPrix == null) {
			throw new UpdatePizzaException("Le nouveau prix ne peut pas être vide ");

		} else {
			Pizza pizzaTemp = new Pizza(monCode, monLibelle, monPrix);
			dao.updatePizza(monCodePizzaAModifier, pizzaTemp);

		}

	}

}
