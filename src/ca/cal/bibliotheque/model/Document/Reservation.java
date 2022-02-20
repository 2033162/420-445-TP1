package ca.cal.bibliotheque.model.Document;

public class Reservation {
    private final String dateReservation;

    public Reservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void faireReservation() {}

    public void annulerReservation() {}
}
