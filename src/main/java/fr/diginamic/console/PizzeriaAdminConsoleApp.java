package fr.diginamic.console;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaMemDao;

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

			valeur = scanner.nextLine();

			if (valeur.equals("1")) {// if effectué lorsque l'utilisateur entre
										// la valeur 1

				// on affiche la liste des pizzas
				List<Pizza> listTemp = dao.findAllPizzas();
				for (int i = 0; i < listTemp.size(); i++) {
					System.out.println(listTemp.get(i).toString());

				}

			} else if (valeur.equals("2")) {// if effectué lorsque l'utilisateur
											// entre la valeur 2

				System.out.println("Veuillez saisir le code :");
				valeur = scanner.nextLine();
				String monCode = valeur;

				System.out.println("Veuillez saisir le nom (sans espace) :");
				valeur = scanner.nextLine();
				String monLibelle = valeur;

				System.out.println("Veuillez saisir le prix :");
				valeur = scanner.nextLine();
				Double monPrix = Double.parseDouble(valeur);

				// création d'une nouvelle instance de Pizza que l'on ajoute
				// dans le tableau arrayPizza

				dao.saveNewPizza(new Pizza(monCode, monLibelle, monPrix));

			} else if (valeur.equals("3")) {// if effectué lorsque l'utilisateur
											// entre la valeur 3

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

				// on modifie les arguments de l'instance de Pizza choisie par
				// l'utilisateur avec les valeurs saisies par l'utilisateur
				dao.updatePizza(monCodePizzaAModifier, pizzaTemp);

			} else if (valeur.equals("4")) {// if effectué lorsque l'utilisateur
											// entre la valeur 4

				// on affiche la liste des pizzas
				List<Pizza> listTemp = dao.findAllPizzas();
				for (int i = 0; i < listTemp.size(); i++) {
					System.out.println(listTemp.get(i).toString());

				}

				System.out.println("Veuillez choisir le code de la pizza à supprimer :");
				valeur = scanner.nextLine();
				String monCodePizzaASupprimer = valeur;

				// on supprime la pizza selectionnée par l'utiilisateur
				dao.deletePizza(monCodePizzaASupprimer);

			} else if (valeur.equals("99")) {// if effectué lorsque
												// l'utilisateur entre la valeur
												// 99
				System.out.println("Aurevoir ☹");
			}

		}
		scanner.close();

	}

}
