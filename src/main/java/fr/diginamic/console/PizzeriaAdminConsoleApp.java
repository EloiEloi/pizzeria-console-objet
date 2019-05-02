package fr.diginamic.console;

import java.util.Scanner;

import fr.pizzeria.model.AjouterPizzaService;
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
		PizzaMemDao dao = new PizzaMemDao();

		// creation / initialisation d'un scanner
		Scanner scanner = new Scanner(System.in);
		String valeur = "";

		while (!valeur.equals("99")) {

			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			/* récupération de la saisie de l'utilisateur */
			valeur = scanner.nextLine();

			if (valeur.equals("1")) {

				MenuService service = new ListerPizzasService();
				// on affiche la liste des pizzas
				service.executeUC(scanner, dao);

			} else if (valeur.equals("2")) {

				// création d'une nouvelle instance de Pizza que l'on ajoute
				// dans le tableau arrayPizza
				MenuService service = new AjouterPizzaService();
				service.executeUC(scanner, dao);

			} else if (valeur.equals("3")) {

				// on modifie les arguments de l'instance de Pizza choisie par
				// l'utilisateur avec les valeurs saisies par l'utilisateur

				MenuService service = new ModifierPizzaService();
				service.executeUC(scanner, dao);

			} else if (valeur.equals("4")) {

				MenuService service = new ListerPizzasService();

				// on affiche la liste des pizzas
				service.executeUC(scanner, dao);

				// on supprime la pizza selectionnée par l'utiilisateur
				service = new SupprimerPizzaService();
				service.executeUC(scanner, dao);

			} else if (valeur.equals("99")) {
				System.out.println("Aurevoir ☹");
			}

		}
		scanner.close();

	}

}
