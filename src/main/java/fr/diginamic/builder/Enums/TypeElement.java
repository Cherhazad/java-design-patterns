package fr.diginamic.builder.Enums;

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

	/** Setter pour typeElement
	 * @param typeElement the typeElement to set
	 */
	public void setTypeElement(String typeElement) {
		this.typeElement = typeElement;
	}
	
	

}
