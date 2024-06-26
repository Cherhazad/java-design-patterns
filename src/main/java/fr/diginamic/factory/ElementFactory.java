package fr.diginamic.factory;

import fr.diginamic.factory.Enums.TypeElement;
import fr.diginamic.factory.Enums.Unite;

public class ElementFactory implements IElementFactory {

	public Element getInstance(TypeElement typeElement, String nom, double valeur, Unite unite) {

		Element element = null;
		
		if (typeElement == null) {
			return null;
		}
		
		switch (typeElement) {

		case ADDITIF:
			element = new Additif(nom, valeur, unite);
			break;
			
		case ALLERGENE:
			element = new Allergene(nom, valeur, unite);
			break;
			
		case INGREDIENT:
			element = new Ingredient(nom, valeur, unite);
			break;
		}
		return element;

	}

}
