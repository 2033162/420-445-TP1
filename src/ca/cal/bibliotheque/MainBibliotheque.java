package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.Document.Documents;
import ca.cal.bibliotheque.model.Document.EtatDocument;
import ca.cal.bibliotheque.model.Document.Livre;
import ca.cal.bibliotheque.model.Document.Passenger;
import ca.cal.bibliotheque.persistance.JDBCBibliothequeH2;
import ca.cal.bibliotheque.service.ServiceBibliotheque;

public class MainBibliotheque {
    //private static Livre livre;

    public static void main(String[] args) {
        JDBCBibliothequeH2.createDatabase();

        //var documents = new Documents("harry potter", "JK. Rolling", "Lina", 1900, 100, livre, EtatDocument.disponible());
        var passenger = new Passenger(1, "John", "Smith");
        ServiceBibliotheque serviceBibliotheque = new ServiceBibliotheque();
        serviceBibliotheque.save(passenger);
        var passenger2 = serviceBibliotheque.getPassenger(1L);
        System.out.println(passenger2);
    }
}