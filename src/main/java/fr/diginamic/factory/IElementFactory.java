package fr.diginamic.factory;

import fr.diginamic.factory.Enums.TypeElement;

public interface IElementFactory { //générer interface avec la méthode en faisant clic droit sur ElementFactory

	Element getInstanceElement(TypeElement typeElement);
	
}
