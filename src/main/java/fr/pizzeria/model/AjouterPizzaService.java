package fr.pizzeria.model;

import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.exception.SavePizzaException;

/**
 * @author Eloi
 * 
 *         class représentant le cas utilisation : 2 , ajout d'une pizza
 *
 */
public class AjouterPizzaService extends MenuService {

	/**
	 * LOG : création de log de trace
	 * 
	 */

	private static final Logger LOG = LoggerFactory.getLogger(AjouterPizzaService.class);

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws SavePizzaException {

		String valeur = "";
		CategoriePizza catPizza = null;
		String monCode;
		String monLibelle;
		Double monPrix;

		System.out.println("Veuillez saisir le code :");
		monCode = scanner.nextLine();

		System.out.println("Veuillez saisir le nom (sans espace) :");
		monLibelle = scanner.nextLine();

		/* debut du while */
		while (catPizza == null) {
			System.out.println("Veuillez choisir une nouvelle catégorie :");
			System.out.println("1 : viande");
			System.out.println("2 : poisson");
			System.out.println("3 : sans viande");
			valeur = scanner.nextLine();
			catPizza = CategoriePizza.trouverCategorie(valeur);
		}

		System.out.println("Veuillez saisir le prix :");
		valeur = scanner.nextLine();

		monPrix = null;

		// on test si la valeur entrée est bien un nombre
		if (NumberUtils.isCreatable(valeur)) {
			// si oui, on transforme le string en double
			monPrix = Double.parseDouble(valeur);
		} else {
			monPrix = null;
		}

		// début des gestions des exceptions
		if (monCode.equals("")) {
			throw new SavePizzaException("Le code n'est pas correct");

		} else if (monLibelle.equals("") || monLibelle.equals("0")) {
			throw new SavePizzaException("Le libellé n'est pas correct");

		} else if (monPrix.equals("0")) {
			throw new SavePizzaException("Le prix ne peut pas valoir : 0 ");

		} else if (monPrix.equals(null)) {
			throw new SavePizzaException("Le prix ne peut pas être vide ");

		} else {
			dao.saveNewPizza(new Pizza(monCode, monLibelle, monPrix, catPizza));

			// trace
			LOG.info("ajout d'une pizza | code : " + monCode + ", libelle : " + monLibelle + ", catérogie : " + catPizza
					+ ", prix : " + monPrix);
		}
		// Fin des exceptions

	}

}
