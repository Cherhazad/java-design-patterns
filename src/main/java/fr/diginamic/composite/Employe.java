package fr.diginamic.composite;

public class Employe implements IElement{

	private String nom;
	private String prenom;
	private double salaire;
	

	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Employe(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	@Override
	public double calculerSalaire() {
		return salaire;
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

	/** Getter pour prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour salaire
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/** Setter pour salaire
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
}
