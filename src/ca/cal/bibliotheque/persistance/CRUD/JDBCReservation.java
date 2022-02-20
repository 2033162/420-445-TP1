package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.Reservation;

public interface JDBCReservation {
    void enregistrer(Reservation reservation);
    Reservation getReservation(long reservationId);
}
