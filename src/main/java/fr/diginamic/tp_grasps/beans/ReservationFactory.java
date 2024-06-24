package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

public class ReservationFactory {

	// per

	public static Reservation getInstance(Client client, LocalDateTime dateReservation, int nbPlaces) {

		Reservation reservation = new Reservation(dateReservation, nbPlaces, nbPlaces);
		return reservation;
	}
}
