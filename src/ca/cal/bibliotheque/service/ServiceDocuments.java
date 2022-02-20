package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.persistance.CRUD.JDBCDocumentsH2;

public class ServiceDocuments {
    public void enregistrer(Documents documents) {
        new JDBCDocumentsH2().enregistrer(documents);
    }

    public Documents getDocument(long documentId) {
        return new JDBCDocumentsH2().getDocuments(documentId);
    }
}
