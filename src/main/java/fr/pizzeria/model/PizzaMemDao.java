/**
 * 
 */
package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eloi
 *
 */
public class PizzaMemDao implements IPizzaDao {

	/** arrayPizza : List<Pizza> */
	private List<Pizza> arrayPizza;

	/**
	 * Constructor
	 * 
	 * @param arrayPizza
	 */
	public PizzaMemDao() {
		arrayPizza = new ArrayList<>();
		arrayPizza.add(new Pizza(0, "PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE));
		arrayPizza.add(new Pizza(1, "MAR", "Margherita", 12.50, CategoriePizza.SANS_VIANDE));
		arrayPizza.add(new Pizza(2, "REIN", "La Reine", 12.50, CategoriePizza.VIANDE));
		arrayPizza.add(new Pizza(3, "FRO", "La 4 fromages", 12.50, CategoriePizza.SANS_VIANDE));
		arrayPizza.add(new Pizza(4, "CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		arrayPizza.add(new Pizza(5, "SAV", "La savoyarde", 12.50, CategoriePizza.VIANDE));
		arrayPizza.add(new Pizza(6, "ORI", "L’orientale", 12.50, CategoriePizza.VIANDE));
		arrayPizza.add(new Pizza(7, "IND", "L’indienne", 12.50, CategoriePizza.POISSON));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return arrayPizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		arrayPizza.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {

		if (pizzaExists(codePizza)) {
			Pizza maPizza = findPizzaByCode(codePizza);
			maPizza.setCode(pizza.getCode());
			maPizza.setLibelle(pizza.getLibelle());
			maPizza.setPrix(pizza.getPrix());
		}

	}

	@Override
	public void deletePizza(String codePizza) {
		if (pizzaExists(codePizza)) {
			Pizza maPizza = findPizzaByCode(codePizza);
			arrayPizza.remove(maPizza);
		}

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza maPizza = null;
		for (int i = 0; i < arrayPizza.size(); i++) {
			if (arrayPizza.get(i).getCode().equals(codePizza)) {
				maPizza = arrayPizza.get(i);
				break;
			}
		}
		return maPizza;

	}

	@Override
	public boolean pizzaExists(String codePizza) {
		Pizza maPizza = findPizzaByCode(codePizza);
		if (maPizza != null) {
			return true;
		}
		return false;
	}

}
