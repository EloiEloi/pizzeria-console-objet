/**
 * 
 */
package fr.pizzeria.model;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.exception.DeletePizzaException;

/**
 * @author Eloi
 *
 *         class représentant le cas utilisation : 4 , suppression d'une pizza
 *
 */
public class SupprimerPizzaService extends MenuService {

	private static final Logger LOG = LoggerFactory.getLogger(AjouterPizzaService.class);

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws DeletePizzaException {

		String valeur = "";

		System.out.println("Veuillez choisir le code de la pizza à supprimer :");
		// on applle la méthode sur "dao", qui supprime de la liste de pizza,
		// la pizza selectionnée par l'utilisateur via le scanner

		valeur = scanner.nextLine(); // assigne la saisie utilisateur à la variable "valeur"

		if (valeur.equals("")) {
			throw new DeletePizzaException("le code pizza n'est pas correct");
		} else {
			dao.deletePizza(valeur);
			LOG.info("suppression de la pizza | code : " + valeur);
		}

	}

}
