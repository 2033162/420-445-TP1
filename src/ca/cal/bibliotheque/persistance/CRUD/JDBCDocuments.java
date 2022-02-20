package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.Documents;

public interface JDBCDocuments {
    void enregistrer(Documents documents);
    Documents getDocuments(long documentsId);
    void modification(Documents documents);
}