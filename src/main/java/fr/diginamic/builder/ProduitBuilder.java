package fr.diginamic.builder;

import fr.diginamic.factory.Enums.Unite;

public class ProduitBuilder {

	private Produit produit;

	/**
	 * Constructeur
	 * 
	 */
	public ProduitBuilder(String nom) { 
		produit = new Produit(nom);

	}
	
	public ProduitBuilder appendCategorie(String nom) {
		produit.setCategorie(new Categorie(nom));
		return this;
	}
	
	public ProduitBuilder appendGrade(String grade) {
		produit.setGrade(grade);
		return this;
	}
	
	public ProduitBuilder appendMarque(String nom) {
		produit.setMarque(new Marque(nom));
		return this;
	}
	
	
	public ProduitBuilder appendIngredient(String nom, double valeur, Unite unite) throws ProduitException {
		if (valeur < 0) {
			throw new ProduitException("La quantité d'un ingrédient doit être strictement positive.");
		}
		produit.getIngredients().add(new Ingredient(nom, valeur, unite));
		return this;
	}
	
	public ProduitBuilder appendAllergene(String nom, double valeur, Unite unite) throws ProduitException {
		
		if (valeur < 0) {
			throw new ProduitException("La quantité d'un allergène doit être strictement positive.");
		}
		
		produit.getAllergenes().add(new Allergene(nom, valeur, unite));
		return this;
	}
	
	public ProduitBuilder appendAdditif(String nom, double valeur, Unite unite) throws ProduitException {
		
		if (valeur < 0) {
			throw new ProduitException("La quantité d'un additif doit être strictement positive.");
		}
		produit.getAdditif().add(new Additif(nom, valeur, unite));
		return this;
	}
	
	public Produit assemble() throws ProduitException {
		
		if (produit.getCategorie() == null) {
			throw new ProduitException("La catégorie est obligatoire.");
		}
		if (produit.getMarque() == null) {
			throw new ProduitException("La marque est obligatoire.");
		}
		if (produit.getIngredients().size() == 0) {
			throw new ProduitException("La catégorie est obligatoire.");
		}
		return produit;
	}

	@Override
	public String toString() {
		return "ProduitBuilder [produit=" + produit + "]";
	}
	
	
}
