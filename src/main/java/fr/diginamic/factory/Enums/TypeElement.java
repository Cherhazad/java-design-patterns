package fr.diginamic.factory.Enums;

public enum TypeElement {
	
	ADDITIF("additif"),
	INGREDIENT("ingredient"),
	ALLERGENE("allergene");
	
	private String typeElement;

	/** Constructeur
	 * @param typeElement
	 */
	private TypeElement(String typeElement) {
		this.typeElement = typeElement;
	}

	/** Getter pour typeElement
	 * @return the typeElement
	 */
	public String getTypeElement() {
		return typeElement;
	} 
}
