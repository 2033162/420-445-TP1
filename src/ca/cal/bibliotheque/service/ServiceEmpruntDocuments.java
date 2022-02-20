package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.EmpruntDocuments;
import ca.cal.bibliotheque.persistance.JDBCEmpruntDocumentsH2;

public class ServiceEmpruntDocuments {
    public void enregistrer(EmpruntDocuments empruntDocument) {
        new JDBCEmpruntDocumentsH2().enregistrer(empruntDocument);
    }

    public EmpruntDocuments getEmpruntDocument(long empruntDocumentId) {
        return new JDBCEmpruntDocumentsH2().getEmpruntDocument(empruntDocumentId);
    }
}
