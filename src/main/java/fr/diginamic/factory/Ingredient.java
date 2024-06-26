package fr.diginamic.factory;

import fr.diginamic.factory.Enums.Unite;

public class Ingredient extends Element {

	// constructeur en visibilite package pour forcer le passage par la Factory
	Ingredient(String nom, double valeur, Unite unite) { 
		super(nom, valeur, unite);
		
	}

}
