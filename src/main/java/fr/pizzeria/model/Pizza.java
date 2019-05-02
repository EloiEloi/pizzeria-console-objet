/**
 * 
 */
package fr.pizzeria.model;

/**
 * @author Eloi
 *
 *         Représente une pizza
 *
 */
public class Pizza {

	private Integer id;
	private String code;
	private String libelle;
	private Double prix;

	private static Integer idLast;

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param libelle
	 * @param prix
	 */
	public Pizza(String code, String libelle, Double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		setIdLast(idLast++);
		this.id = getIdLast();
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param code
	 * @param libelle
	 * @param prix
	 */
	public Pizza(Integer id, String code, String libelle, Double prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		setIdLast(id);
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 *
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 *
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * Setter
	 *
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/**
	 * Getter
	 * 
	 * @return the idLast
	 */
	public static Integer getIdLast() {
		return idLast;
	}

	/**
	 * Setter
	 *
	 * @param idLast
	 *            the idLast to set
	 */
	public static void setIdLast(Integer idLast) {
		Pizza.idLast = idLast;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (prix == null) {
			if (other.prix != null)
				return false;
		} else if (!prix.equals(other.prix))
			return false;
		return true;
	}

}
