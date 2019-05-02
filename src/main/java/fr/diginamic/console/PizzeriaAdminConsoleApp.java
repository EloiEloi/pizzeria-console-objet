package fr.diginamic.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

/**
 * @author Eloi
 *
 */
public class PizzeriaAdminConsoleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Pizza> arrayPizza = new ArrayList<>();
		arrayPizza.add(new Pizza(1, "PEP", "Pépéroni", 12.50));
		arrayPizza.add(new Pizza(2, "MAR", "Margherita", 12.50));
		arrayPizza.add(new Pizza(3, "REIN", "La Reine", 12.50));
		arrayPizza.add(new Pizza(4, "FRO", "La 4 fromages", 12.50));
		arrayPizza.add(new Pizza(5, "CAN", "La cannibale", 12.50));
		arrayPizza.add(new Pizza(6, "SAV", "La savoyarde", 12.50));
		arrayPizza.add(new Pizza(7, "ORI", "L’orientale", 12.50));
		arrayPizza.add(new Pizza(8, "IND", "L’indienne", 12.50));

		String valeur = "";
		Scanner scanner = new Scanner(System.in);

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
				System.out.println("----- Liste des pizzas -----");

				// création d'un StringBuilder pour concatener les arguments de
				// l'objet Pizza dans une phrase "lisible" pour l'utilisateur
				StringBuilder message = new StringBuilder();

				for (int i = 0; i < arrayPizza.size(); i++) {
					message.append(arrayPizza.get(i).getCode()).append(" -> ").append(arrayPizza.get(i).getLibelle())
							.append(" (").append(arrayPizza.get(i).getPrix()).append(" €)\n");
				}
				System.out.println(message); // on affiche la liste des pizzas

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
				arrayPizza.add(new Pizza(monCode, monLibelle, monPrix));

			} else if (valeur.equals("3")) {// if effectué lorsque l'utilisateur
											// entre la valeur 3

				System.out.println("----- Liste des pizzas -----");

				// création d'un StringBuilder pour concatener les arguments de
				// l'objet Pizza dans une phrase "lisible" pour l'utilisateur
				StringBuilder message = new StringBuilder();

				for (int i = 0; i < arrayPizza.size(); i++) {
					message.append(arrayPizza.get(i).getCode()).append(" -> ").append(arrayPizza.get(i).getLibelle())
							.append(" (").append(arrayPizza.get(i).getPrix()).append(" €)\n");
				}
				System.out.println(message); // on affiche la liste des pizzas

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

				// on modifie les arguments de l'instance de Pizza choisie par
				// l'utilisateur avec les valeurs saisies par l'utilisateur
				for (int i = 0; i < arrayPizza.size(); i++) {
					if (arrayPizza.get(i).getCode().equals(monCodePizzaAModifier)) {
						arrayPizza.get(i).setCode(monCode);
						arrayPizza.get(i).setLibelle(monLibelle);
						arrayPizza.get(i).setPrix(monPrix);
					}
				}

			} else if (valeur.equals("4")) {// if effectué lorsque l'utilisateur
											// entre la valeur 4

				// création d'un StringBuilder pour concatener les arguments de
				// l'objet Pizza dans une phrase "lisible" pour l'utilisateur
				StringBuilder message = new StringBuilder();

				for (int i = 0; i < arrayPizza.size(); i++) {
					message.append(arrayPizza.get(i).getCode()).append(" -> ").append(arrayPizza.get(i).getLibelle())
							.append(" (").append(arrayPizza.get(i).getPrix()).append(" €)\n");
				}
				System.out.println(message); // on affiche la liste des pizzas

				System.out.println("Veuillez choisir le code de la pizza à supprimer :");
				valeur = scanner.nextLine();
				String monCodePizzaASupprimer = valeur;

				// on supprime la pizza selectionnée par l'utiilisateur
				for (int i = 0; i < arrayPizza.size(); i++) {
					if (arrayPizza.get(i).getCode().equals(monCodePizzaASupprimer)) {
						arrayPizza.remove(arrayPizza.get(i)); // suppression
																// de
																// l'instance
																// de la
																// Pizza
																// selectionnée
																// dans
																// le
																// tableau
					}
				}

			} else if (valeur.equals("99")) {// if effectué lorsque
												// l'utilisateur entre la valeur
												// 99
				System.out.println("Aurevoir ☹");
			}

		}
		scanner.close();

	}

}
