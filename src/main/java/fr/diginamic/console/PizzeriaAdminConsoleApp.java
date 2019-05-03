package fr.diginamic.console;

import java.util.Scanner;

import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.IPizzaDao;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.MenuService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.PizzaMemDao;
import fr.pizzeria.model.SupprimerPizzaService;

/**
 * @author Eloi
 *
 */
public class PizzeriaAdminConsoleApp {

	/**
	 * 
	 * Methode point d'entrée d'execution de la pizzaria
	 * 
	 * @param args
	 *            non utilisé dans cette application
	 */
	public static void main(String[] args) {

		// creation / initianilisation de la liste de pizza
		IPizzaDao dao = new PizzaMemDao();

		// creation / initialisation d'un scanner
		Scanner scanner = new Scanner(System.in);
		// création / initialisation d'une variable pour réucupérer la furtur entrée utilisateur
		String valeur = "";

		while (!valeur.equals("99")) {

			// affichage du menu
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			// récupération de la saisie de l'utilisateur
			valeur = scanner.nextLine();

			if (valeur.equals("1")) {

				// création d'une instance de ListerPizzasService
				MenuService service = new ListerPizzasService();

				try {
					// on appelle la methode pour afficher la liste des pizzas
					service.executeUC(scanner, dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}

			} else if (valeur.equals("2")) {

				// création d'une instance de AjouterPizzaService
				MenuService service = new AjouterPizzaService();
				// on appelle la méthode pour ajouter la pizza

				try {
					// on appelle la méthode pour modifier la pizza
					service.executeUC(scanner, dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}

			} else if (valeur.equals("3")) {

				// création d'une instance de ModifierPizzaService
				MenuService service = new ModifierPizzaService();

				try {
					// on appelle la méthode pour modifier la pizza
					service.executeUC(scanner, dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}

			} else if (valeur.equals("4")) {

				// création d'une instance de ListerPizzasService
				MenuService service = new ListerPizzasService();

				try {
					// on appelle la methode pour afficher la liste des pizzas
					service.executeUC(scanner, dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}

				// on passe l'object SupprimerPizzaService à l'instance
				service = new SupprimerPizzaService();

				try {
					// on appelle la methode pour afficher supprimer uen pizza
					service.executeUC(scanner, dao);
				} catch (StockageException e) {
					System.out.println(e.getMessage());
				}

			} else if (valeur.equals("99")) {
				// on affiche un texte pour indiquer la fin du programme
				System.out.println("Aurevoir ☹");
			}

		}
		scanner.close();

	}

}
