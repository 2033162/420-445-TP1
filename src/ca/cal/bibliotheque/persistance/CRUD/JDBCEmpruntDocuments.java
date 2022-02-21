package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.Clients;
import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.model.EmpruntDocuments;
import ca.cal.bibliotheque.model.EtatDocument;

import java.util.List;

public interface JDBCEmpruntDocuments {
    void enregistrer(EmpruntDocuments empruntDocuments);
    EmpruntDocuments getEmpruntDocument(long empruntDocumentId);
    void modification(EmpruntDocuments empruntDocuments);
    void suppression(EmpruntDocuments empruntDocuments);
    long getMaxId();
    List<EmpruntDocuments> getClientEmpruntRetard(long clientId);
}
