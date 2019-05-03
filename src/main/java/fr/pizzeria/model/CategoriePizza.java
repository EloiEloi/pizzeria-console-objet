/**
 * 
 */
package fr.pizzeria.model;

/**
 * @author Eloi
 *
 */
public enum CategoriePizza {
	VIANDE("1", "Viande"), POISSON("2", "Poisson"), SANS_VIANDE("3", "Sans Viande");

	private String numCatPizza;
	private String catPizza;

	private CategoriePizza(String numCatPizza, String catPizza) {
		this.catPizza = catPizza;
		this.setNumCatPizza(numCatPizza);
	}

	public static CategoriePizza trouverCategorie(String monString) {
		CategoriePizza[] tabTemp = CategoriePizza.values();
		CategoriePizza macat;
		for (int i = 0; i < tabTemp.length; i++) {
			if (monString.equals(tabTemp[i].getNumCatPizza())) {
				macat = tabTemp[i];
				return macat;
			}
		}
		return null;

	}

	/**
	 * Getter
	 * 
	 * @return the genrePizza
	 */
	public String getGenrePizza() {
		return catPizza;
	}

	/**
	 * Setter
	 *
	 * @param genrePizza
	 *            the genrePizza to set
	 */
	public void setGenrePizza(String genrePizza) {
		this.catPizza = genrePizza;
	}

	/**
	 * Getter
	 * 
	 * @return the numCatPizza
	 */
	public String getNumCatPizza() {
		return numCatPizza;
	}

	/**
	 * Setter
	 *
	 * @param numCatPizza
	 *            the numCatPizza to set
	 */
	public void setNumCatPizza(String numCatPizza) {
		this.numCatPizza = numCatPizza;
	}

}
