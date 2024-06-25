package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		IElement serviceDSIN = new Service("DSIN");
		IElement serviceBigData = new Service("Big Data");
		IElement serviceJavaDev = new Service("Java Dev");
		
		IElement employe1 = new Employe("RASPEY", "Cécile", 10000);
		IElement employe2 = new Employe("BECHKAR", "Bilel", 8000);
		IElement employe3 = new Employe("RANMEY", "JB", 7500);
		IElement employe4 = new Employe("DOE", "Jane", 3500);
		IElement employe5 = new Employe("GUINEAU", "Kevin", 7500);
		IElement employe6 = new Employe("MARTIN", "Paul", 3500);
		
		
		
		

	}

}
