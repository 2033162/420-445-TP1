package ca.cal.bibliotheque.model;

import java.util.Date;

public class Reservation {
    private final long id;
    private final Date dateReservation;
    private final Clients client;

    public Reservation(long id, Date dateReservation, Clients client) {
        this.id = id;
        this.dateReservation = dateReservation;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public Clients getClient() {
        return client;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void faireReservation() {}

    public void annulerReservation() {}


}
