package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.EmpruntDocuments;
import ca.cal.bibliotheque.persistance.CRUD.JDBCEmpruntDocumentsH2;

public class ServiceEmpruntDocuments {
    public void enregistrer(EmpruntDocuments empruntDocument) {
        new JDBCEmpruntDocumentsH2().enregistrer(empruntDocument);
    }

    public void modification(EmpruntDocuments empruntDocument) {
        new JDBCEmpruntDocumentsH2().modification(empruntDocument);
    }

    public void suppression(EmpruntDocuments empruntDocument) {
        new JDBCEmpruntDocumentsH2().suppression(empruntDocument);
    }

    public EmpruntDocuments getEmpruntDocument(long empruntDocumentId) {
        return new JDBCEmpruntDocumentsH2().getEmpruntDocument(empruntDocumentId);
    }
}
