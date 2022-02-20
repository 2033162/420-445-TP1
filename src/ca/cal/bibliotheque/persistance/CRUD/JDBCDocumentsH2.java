package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.model.EtatDocument;
import ca.cal.bibliotheque.persistance.DB.JDBCConfig;
import ca.cal.bibliotheque.persistance.DB.JDBCException;

import java.sql.*;

public class JDBCDocumentsH2 implements JDBCDocuments {

    public void enregistrer(Documents documents) {
        JDBCBibliotheque.enregistrer("INSERT INTO DOCUMENTS VALUES (" +
                documents.getId() +
                ",'" + documents.getGenreDocument() +
                "','" + documents.getEtatDocument() +
                "','" + documents.getTitre() +
                "','" + documents.getAuteur() +
                "','" + documents.getEditeur() +
                "'," + documents.getAnneePublication() + ");");
    }

    public Documents getDocuments(long documentsId) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            PreparedStatement ps = conn.prepareStatement("SELECT * from DOCUMENTS WHERE id = ?");) {

            ps.setLong(1, documentsId);

            // NOTEZ le try à l'intérieur du try
            try (ResultSet rs = ps.executeQuery();) {
                rs.next();
                return new Documents(
                        rs.getLong("id"),
                        EtatDocument.get(rs.getString("etatDocument")),
                        rs.getString("genreDocument"),
                        rs.getString("titre"),
                        rs.getString("auteur"),
                        rs.getString("editeur"),
                        rs.getInt("anneePublication")
                );
            }
        } catch (SQLException e) {
            JDBCException.handleException(e);
            return null;
        }
    }

    public void modification(Documents documents) {
        JDBCBibliotheque.modification("UPDATE DOCUMENTS SET " +
                "etatDocument='" + documents.getEtatDocument() +
                "', genreDocument='" + documents.getGenreDocument() +
                "', titre='" + documents.getTitre() +
                "', auteur='" + documents.getAuteur() +
                "', editeur='" + documents.getEditeur() +
                "', anneePublication='" + documents.getAnneePublication() + "'" +
                " WHERE id=" + documents.getId() + ";");
    }
}
