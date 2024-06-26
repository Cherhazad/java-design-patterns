package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

public class ReservationFactory {

	// pertinent de mettre cette classe de le même package beans car permet de
	// mettre en visibilité package les constructeurs pour obliger de passer par la
	// factory pour une réservation

	public static Reservation getInstance(Client client, TypeReservation type, LocalDateTime dateReservation,
			int nbPlaces) {
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		reservation.setTotal(type.calculTotal(nbPlaces, client));
		return reservation;
	}

}
