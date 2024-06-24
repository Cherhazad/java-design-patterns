package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder {

	private Produit produit;

	/**
	 * Constructeur
	 * 
	 */
	public ProduitBuilder() {
		this.produit = new Produit();
		this.produit.setIngredients(new ArrayList<>());
		this.produit.setAdditif(new ArrayList<>());
		this.produit.setAllergenes(new ArrayList<>());	
	}

	public ProduitBuilder appendNom(String nom) {
		produit.setNom(nom);
		return this;
	}
	
	public ProduitBuilder appendCategorie(Categorie categorie) {
		produit.setCategorie(categorie);
		return this;
	}
	
	public ProduitBuilder appendGrade(String grade) {
		produit.setGrade(grade);
		return this;
	}
	
	public ProduitBuilder appendMarque(Marque nomMarque) {
		produit.setMarque(nomMarque);
		return this;
	}
	
	public ProduitBuilder appendUnIngredient(Ingredient ingredient) {
		produit.getIngredients().add(ingredient);
		return this;
	}
	
	public ProduitBuilder appendDesIngredients(List<Ingredient> ingredients) {
		produit.setIngredients(ingredients);
		return this;
	}
	
	public ProduitBuilder appendUnAllergene(Allergene allergene) {
		produit.getAllergenes().add(allergene);
		return this;
	}
	
	public ProduitBuilder appendAllergenes(List<Allergene> allergenes) {
		produit.setAllergenes(allergenes);
		return this;
	}
	
	public ProduitBuilder appendUnAdditif(Additif additif) {
		produit.getAdditif().add(additif);
		return this;
	}
	
	public ProduitBuilder appendAdditifs(List<Additif> additifs) {
		return this.appendAdditifs(additifs);
	}
	
	public Produit assemble() {
		return produit;
	}

	@Override
	public String toString() {
		return "ProduitBuilder [produit=" + produit + "]";
	}
	
	
}
