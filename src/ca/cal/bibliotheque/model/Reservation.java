package ca.cal.bibliotheque.model;

import java.util.Date;

public class Reservation {
    private final Date dateReservation;
    private final Clients client;

    public Reservation(Date dateReservation, Clients client) {
        this.dateReservation = dateReservation;
        this.client = client;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void faireReservation() {}

    public void annulerReservation() {}


}
