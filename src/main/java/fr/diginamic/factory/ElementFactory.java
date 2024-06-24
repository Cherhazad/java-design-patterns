package fr.diginamic.factory;

import fr.diginamic.factory.Enums.TypeElement;

public class ElementFactory implements ElementFactoryInterface {

	public static Element getInstanceElement(TypeElement typeElement) {

		switch (typeElement) {

		case ADDITIF:
			return new Additif(null, 0, null);

		case ALLERGENE:
			return new Allergene(null, 0, null);

		case INGREDIENT:
			return new Ingredient(null, 0, null);

		default:
			return null;
		}

	}

}
