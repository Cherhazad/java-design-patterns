package fr.diginamic.builder;

import fr.diginamic.factory.Enums.Unite;

public class BuilderExec {

	public static void main(String[] args) {
		
		ProduitBuilder builder = new ProduitBuilder();
		Categorie categorie1 = new Categorie("Détergent");
		Marque marque1 = new Marque("Briochin");
		Ingredient ingredient1 = new Ingredient("oeuf", 55.5, Unite.GRAMME);
		
		
		builder = builder.appendNom("Vinaigre blanc").appendGrade("A+").appendCategorie(categorie1).appendMarque(marque1).appendUnIngredient(ingredient1);
		Produit produit = builder.assemble();
		System.out.println(produit); // TODO mettre des conditions dans le toString en fonction de ce qui compose le produit
	}

}
