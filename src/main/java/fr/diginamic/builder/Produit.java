package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Produit {

	private String nom;
	private String grade;
	private Marque marque;
	private Categorie categorie;

	private List<Ingredient> ingredients = new ArrayList<>();
	private List<Allergene> allergenes = new ArrayList<>();
	private List<Additif> additif = new ArrayList<>();

	
	
	/** Constructeur
	 * 
	 */
	public Produit() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param grade
	 * @param marque
	 * @param categorie
	 * @param ingredients
	 * @param allergenes
	 * @param additif
	 */

	Produit(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour grade
	 * 
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Setter pour grade
	 * 
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Getter pour marque
	 * 
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * Setter pour marque
	 * 
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/**
	 * Getter pour categorie
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setter pour categorie
	 * 
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter pour ingredients
	 * 
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Setter pour ingredients
	 * 
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Getter pour allergenes
	 * 
	 * @return the allergenes
	 */
	public List<Allergene> getAllergenes() {
		return allergenes;
	}

	/**
	 * Setter pour allergenes
	 * 
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	/**
	 * Getter pour additif
	 * 
	 * @return the additif
	 */
	public List<Additif> getAdditif() {
		return additif;
	}

	/**
	 * Setter pour additif
	 * 
	 * @param additif the additif to set
	 */
	public void setAdditif(List<Additif> additif) {
		this.additif = additif;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", grade=" + grade + ", marque=" + marque + ", categorie=" + categorie
				+ ", ingredients=" + ingredients + ", allergenes=" + allergenes + ", additif=" + additif + "]";
	}

	
	
}
