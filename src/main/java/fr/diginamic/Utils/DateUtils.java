package fr.diginamic.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Classe utilitaire fournissant des services de conversion entre dates et chaînes de caractères
 * 
 */
public final class DateUtils { // bonne pratique de mettre les classes utilitaires en final car pas de sens qu'une classe utilitaire ait des classes filles
	
	/** FORMAT_STANDARD : format d'affiche standard des dates heures dans l'application */
	private static final DateTimeFormatter FORMAT_STANDARD = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
	public static LocalDateTime toDate(String dateStr) {
		
		return LocalDateTime.parse(dateStr, FORMAT_STANDARD);
	}

}
