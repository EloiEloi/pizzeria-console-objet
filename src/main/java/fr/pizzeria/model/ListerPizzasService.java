package fr.pizzeria.model;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Eloi
 * 
 *         class représentant le cas utilisation : 1 , lister les pizzas existantes
 *
 */
public class ListerPizzasService extends MenuService {

	private static final Logger LOG = LoggerFactory.getLogger(AjouterPizzaService.class);

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {
		System.out.println("Liste des pizzas :");
		// on affiche la liste des pizzas
		List<Pizza> listTemp = dao.findAllPizzas();
		for (int i = 0; i < listTemp.size(); i++) {
			System.out.println(listTemp.get(i).toString());

		}

		// trace
		LOG.info("listage des pizzas");
	}

}
