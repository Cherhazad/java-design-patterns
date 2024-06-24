package fr.diginamic.builder;

import java.util.List;

import fr.diginamic.factory.Enums.Unite;

public class Allergene extends Element {
	
	private List <Produit> produits;

	/** Constructeur
	 * @param nom
	 * @param valeur
	 * @param unite
	 * @param produits
	 */
	public Allergene(String nom, double valeur, Unite unite) {
		super(nom, valeur, unite);
	}

	/** Getter pour produits
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/** Setter pour produits
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
