package fr.diginamic.builder;

import fr.diginamic.factory.Enums.Unite;

public abstract class Element { // on met cette classe en abstract pour qu'on ne puisse pas instancier Element et qu'on instancie que les classe filles
	
	private String nom;
	private double valeur;
	private Unite unite;
	
	
	/** Constructeur
	 * @param nom
	 * @param valeur
	 * @param unite
	 */
	public Element(String nom, double valeur, Unite unite) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}


	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/** Getter pour valeur
	 * @return the valeur
	 */
	public double getValeur() {
		return valeur;
	}


	/** Setter pour valeur
	 * @param valeur the valeur to set
	 */
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}


	/** Getter pour unite
	 * @return the unite
	 */
	public Unite getUnite() {
		return unite;
	}


	/** Setter pour unite
	 * @param unite the unite to set
	 */
	public void setUnite(Unite unite) {
		this.unite = unite;
	}


	@Override
	public String toString() {
		return "[nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
	}

	

}