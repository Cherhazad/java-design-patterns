package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class TestComposite {

	public static void main(String[] args) {
		
		Service serviceDSIN = new Service("DSIN");
		Service serviceBigData = new Service("Big Data");
		Service serviceJavaDev = new Service("Java Dev");
		
		Employe employe1 = new Employe("RASPEY", "Cécile", 10000);
		Employe employe2 = new Employe("BECHKAR", "Bilel", 8000);
		Employe employe3 = new Employe("RANMEY", "JB", 7500);
		Employe employe4 = new Employe("DOE", "Jane", 3500);
		Employe employe5 = new Employe("GUINEAU", "Kevin", 7500);
		Employe employe6 = new Employe("MARTIN", "Paul", 3500);
		
		
		serviceBigData.setElement(new ArrayList<IElement>(Arrays.asList(employe3, employe4)));
		serviceJavaDev.setElement(new ArrayList<IElement>(Arrays.asList(employe5, employe6)));
		serviceDSIN.setElement(new ArrayList<IElement>(Arrays.asList(employe1, employe2, serviceBigData, serviceJavaDev)));
		
		
		double salaireDSIN = serviceDSIN.calculerSalaire();
		double salaireBigData = serviceBigData.calculerSalaire();
		double salaireJavadDev = serviceJavaDev.calculerSalaire();
		
		System.out.println("Salaire service DSIN: " + salaireDSIN);
		System.out.println("Salaire service Big Data: " + salaireBigData);
		System.out.println("Salaire service Java Dev: " + salaireJavadDev);
		
		
	}

}
