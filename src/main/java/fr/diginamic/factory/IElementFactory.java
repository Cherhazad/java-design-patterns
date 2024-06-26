package fr.diginamic.factory;

import fr.diginamic.factory.Enums.TypeElement;
import fr.diginamic.factory.Enums.Unite;

public interface IElementFactory {

	Element getInstance(TypeElement typeElement, String nom, double valeur, Unite unite);
	
}
