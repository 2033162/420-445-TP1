package ca.cal.bibliotheque.persistance;

import ca.cal.bibliotheque.model.Clients;

import java.sql.*;

public class JDBCClientH2 implements JDBCBClient {

    public static void enregistrer(Clients clients) {
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO CLIENTS VALUES (" +
                    clients.getId() +
                    ",'" + clients.getNom() +
                    "','" + clients.getPrenom() +
                    "','" + clients.getRue() +
                    "','" + clients.getVille() +
                    "','" + clients.getCodePostal() +
                    "','" + clients.getNumeroTelephone() +
                    "','" + clients.getDateInscriptionChaine() +
                    "'," + clients.getNbrEmpruntEnCour() + ");";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            JDBCException.handleException(e);
        }
    }

    public static Clients getClients(long clientsId) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            PreparedStatement ps = conn.prepareStatement("SELECT * from CLIENTS WHERE id = ?");) {

            ps.setLong(1, 1);

            // NOTEZ le try à l'intérieur du try
            try (ResultSet rs = ps.executeQuery();) {
                rs.next();
                return new Clients(rs.getLong("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("rue"),
                        rs.getString("ville"),
                        rs.getString("codePostal"),
                        rs.getString("numeroTelephone"),
                        rs.getDate("dateInscription"),
                        rs.getInt("nbrEmpruntEnCour"));
            }
        } catch (SQLException e) {
            JDBCException.handleException(e);
            return null;
        }
    }
}