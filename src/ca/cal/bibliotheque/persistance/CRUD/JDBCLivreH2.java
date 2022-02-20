package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.model.Livre;
import ca.cal.bibliotheque.persistance.DB.JDBCConfig;
import ca.cal.bibliotheque.persistance.DB.JDBCException;

import java.sql.*;

public class JDBCLivreH2 implements JDBCLivre {
    public void enregistrer(Livre livre) {
        new JDBCDocumentsH2().enregistrer(livre.getDocument());
        JDBCBibliotheque.enregistrer("INSERT INTO LIVRE VALUES (" +
                livre.getId() +
                "," + livre.getNbrPages() +
                ",'" + livre.getGenreLivre() +
                "'," + livre.getDocument().getId() + ");");
    }

    public Livre getLivre(long livreId) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            PreparedStatement ps = conn.prepareStatement("SELECT * from LIVRE WHERE id = ?");) {

            ps.setLong(1, livreId);

            Documents documents = new JDBCDocumentsH2().getDocuments(livreId);

            // NOTEZ le try à l'intérieur du try
            try (ResultSet rs = ps.executeQuery();) {
                rs.next();
                return new Livre(
                        documents,
                        rs.getInt("nbrPages"),
                        rs.getString("genreLivre")
                );
            }
        } catch (SQLException e) {
            JDBCException.handleException(e);
            return null;
        }
    }
}
