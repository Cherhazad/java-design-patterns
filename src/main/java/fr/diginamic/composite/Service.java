package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

	private String nom;
	List<IElement> elements = new ArrayList<>();

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Service(String nom) {
		super();
		this.nom = nom;
	}

	@Override
    public double calculerSalaire() {
        double salaireTotal = 0;
        for (IElement element : elements) {
            salaireTotal += element.calculerSalaire();
        }
        return salaireTotal;
    }
	
	//Seconde façon de calculer le salaire
//	public double calculerSalaire() {
//		return  elements.stream().mapToDouble(e -> e.calculerSalaire()).sum();
//        
//    }

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

	/** Getter pour element
	 * @return the element
	 */
	public List<IElement> getElement() {
		return elements;
	}

	/** Setter pour element
	 * @param element the element to set
	 */
	public void setElement(List<IElement> elements) {
		this.elements = elements;
	}

}
