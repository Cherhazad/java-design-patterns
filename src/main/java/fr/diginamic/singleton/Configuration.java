package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

public class Configuration {
	
	// Je charge ma classe lors du démarrage de l'application (les variables static)
	private static Configuration instance = new Configuration();
	
	private HashMap<String, String> proprietes = new HashMap<>();
	
	private Configuration() {
		init();
	}

	private void init() {
		ResourceBundle bundle = ResourceBundle.getBundle("configuration") ;

		for (String cle : bundle.keySet()) {//retourne un set de toutes les clés
			String valeur = bundle.getString(cle); //récupère les valeur associées aux différentes clés
			proprietes.put(cle, valeur); //insère dans la HashMap proprietes créée en haut
		}
	
	}

	/** Getter pour instance
	 * @return the instance
	 */
	public static Configuration getInstance() {
		return instance;
	}


	public String getValeur(String cle) {
		return proprietes.get(cle);
	}
	
	public Set<String> getCles() {
		return proprietes.keySet();
	}
	

}
