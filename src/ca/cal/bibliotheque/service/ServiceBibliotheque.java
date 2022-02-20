package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.Document.Passenger;
import ca.cal.bibliotheque.persistance.JDBCBibliothequeH2;

public class ServiceBibliotheque {
    public void save(Passenger passenger) {
        JDBCBibliothequeH2.save(passenger);
    }

    public Passenger getPassenger(long passengerId) {
        return JDBCBibliothequeH2.getPassenger(passengerId);
    }
}