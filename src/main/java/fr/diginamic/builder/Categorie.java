package fr.diginamic.builder;

import java.util.List;

public class Categorie {
	
	private List<Produit> produits;
	private String nom;
	
	/** Constructeur
	 * @param produits
	 * @param nom
	 */
	public Categorie(String nom) {
		this.nom = nom;
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

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Categorie [nom=" + nom + "]";
	}
	
	
	
	

}
