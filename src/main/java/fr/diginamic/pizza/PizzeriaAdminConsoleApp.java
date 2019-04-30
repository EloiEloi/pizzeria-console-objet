package fr.diginamic.pizza;

import java.util.Scanner;

/**
 * @author Eloi
 *
 */
public class PizzeriaAdminConsoleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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

			if (valeur.equals("1")) {
				System.out.println("Liste des pizzas");
			} else if (valeur.equals("2")) {
				System.out.println("Ajout d’une nouvelle pizza");
			} else if (valeur.equals("3")) {
				System.out.println("Mise à jour d’une pizza");
			} else if (valeur.equals("4")) {
				System.out.println("Suppression d’une pizza");
			} else if (valeur.equals("99")) {
				System.out.println("Aurevoir ☹");
			}

		}
		scanner.close();

	}

}
