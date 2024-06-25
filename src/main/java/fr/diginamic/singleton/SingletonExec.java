package fr.diginamic.singleton;

import java.util.List;
import java.util.ResourceBundle;

public class SingletonExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valeurPropriete = Configuration.getInstance().getValeur("langue.default");

	}

}
