package fr.diginamic.Utils;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class CalculMontantReservation {

	/**
     * Calcule le montant total de la réservation en fonction du nombre de places,
     * du type de réservation et du statut premium du client.
     * 
     * @param typeReservation le type de réservation
     * @param nbPlaces le nombre de places
     * @param isPremium indique si le client est premium
     * @return le montant total de la réservation
     */
    public static double calculerMontant(TypeReservation typeReservation, int nbPlaces, boolean isPremium) {
        double total = typeReservation.getMontant() * nbPlaces;
        if (isPremium) {
            return total * (1 - typeReservation.getReductionPourcent() / 100.0);
        } else {
            return total;
        }
    }
	
}
