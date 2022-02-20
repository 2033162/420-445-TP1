package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.Document.Passenger;
import ca.cal.bibliotheque.service.ServiceBibliotheque;

public class MainBibliotheque {

    public static void main(String[] args) {
        var passenger = new Passenger(1, "John", "Smith");
        ServiceBibliotheque serviceBibliotheque = new ServiceBibliotheque();
        serviceBibliotheque.save(passenger);
        var passenger2 = serviceBibliotheque.getPassenger(1L);
        System.out.println(passenger2);
    }
}