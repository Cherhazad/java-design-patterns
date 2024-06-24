package fr.diginamic.builder.Enums;

public enum Unite {
	
	MICRO_GRAMMES("µg"),
	MILLI_GRAMMES("mg"),
	GRAMME("g"),
	KILO_GRAMMES("kg");

	private String libelle;
	
	private Unite(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	
}
