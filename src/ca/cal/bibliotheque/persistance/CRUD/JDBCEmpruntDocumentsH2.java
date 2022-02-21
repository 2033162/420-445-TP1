package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.CD;
import ca.cal.bibliotheque.model.EmpruntDocuments;
import ca.cal.bibliotheque.persistance.DB.JDBCConfig;
import ca.cal.bibliotheque.persistance.DB.JDBCException;

import java.sql.*;

public class JDBCEmpruntDocumentsH2 implements JDBCEmpruntDocuments {
    public void enregistrer(EmpruntDocuments empruntDocuments) {
        JDBCBibliotheque.enregistrer("INSERT INTO EMPRUNTDOCUMENT VALUES (" +
                empruntDocuments.getId() +
                ",'" + empruntDocuments.getDateInitialChaine() +
                "','" + empruntDocuments.getDateExpireChaine() +
                "'," + empruntDocuments.getNbrRappel() +
                "," + empruntDocuments.getClient().getId() +
                "," + empruntDocuments.getDocument().getId() + ");");
    }

    public EmpruntDocuments getEmpruntDocument(long empruntDocumentId) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            PreparedStatement ps = conn.prepareStatement("SELECT * from EMPRUNTDOCUMENT WHERE id = ?");) {

            ps.setLong(1, empruntDocumentId);

            // NOTEZ le try à l'intérieur du try
            try (ResultSet rs = ps.executeQuery();) {
                rs.next();
                return new EmpruntDocuments(rs.getLong("id"),
                        rs.getDate("dateInitial"),
                        rs.getDate("dateExpire"),
                        rs.getInt("nbrRappel"),
                        new JDBCClientH2().getClients(rs.getInt("idClient")),
                        new JDBCDocumentsH2().getDocuments(rs.getInt("idDocument")));
            }
        } catch (SQLException e) {
            JDBCException.handleException(e);
            return null;
        }
    }

    public void modification(EmpruntDocuments empruntDocuments) {
        JDBCBibliotheque.modification("UPDATE EMPRUNTDOCUMENT SET " +
                "dateInitial='" + empruntDocuments.getDateInitialChaine() +
                "', dateExpire='" + empruntDocuments.getDateExpireChaine() +
                "', nbrRappel=" + empruntDocuments.getNbrRappel() +
                ", idClient=" + empruntDocuments.getClient().getId() +
                ", idDocument=" + empruntDocuments.getDocument().getId() +
                " WHERE id=" + empruntDocuments.getId() + ";");
    }

    public void suppression(EmpruntDocuments empruntDocuments) {
        JDBCBibliotheque.suppression("EMPRUNTDOCUMENT", empruntDocuments.getId());
    }
}
