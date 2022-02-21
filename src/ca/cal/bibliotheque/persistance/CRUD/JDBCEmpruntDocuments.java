package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.CD;
import ca.cal.bibliotheque.model.EmpruntDocuments;
import ca.cal.bibliotheque.model.Reservation;

public interface JDBCEmpruntDocuments {
    void enregistrer(EmpruntDocuments empruntDocuments);
    EmpruntDocuments getEmpruntDocument(long empruntDocumentId);
    void modification(EmpruntDocuments empruntDocuments);
    void suppression(EmpruntDocuments empruntDocuments);
}
