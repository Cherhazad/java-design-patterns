package fr.diginamic.factory.Enums;

public enum Unite {
	
	MICRO_GRAMMES("µg"),
	MILLI_GRAMMES("mg");

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

	/** Setter pour libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
}
