package fr.diginamic.factory;

import fr.diginamic.factory.Enums.TypeElement;
import fr.diginamic.factory.Enums.Unite;

public abstract class ElementFactory implements IElementFactory {

	public static Element getInstanceElement(TypeElement typeElement, String nom, double valeur, Unite unite) {

		if (typeElement == null) {
			return null;
		}
		
		switch (typeElement) {

		case ADDITIF:
			return new Additif(nom, valeur, unite);

		case ALLERGENE:
			return new Allergene(nom, valeur, unite);

		case INGREDIENT:
			return new Ingredient(nom, valeur, unite);

		default:
			return null;
		}

	}

}
