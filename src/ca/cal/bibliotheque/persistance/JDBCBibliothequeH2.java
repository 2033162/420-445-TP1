package ca.cal.bibliotheque.persistance;

import ca.cal.bibliotheque.model.Passenger;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.*;

public class JDBCBibliothequeH2 implements JDBCBibliotheque {

    public static void save(Passenger passenger) {
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO PASSENGER VALUES (" + passenger.getId() +
                    ",'" + passenger.getFirstName() +
                    "','" + passenger.getLastName() + "');";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            JDBCException.handleException(e);
        }
    }

    public static Passenger getPassenger(long passengerId) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            PreparedStatement ps = conn.prepareStatement("SELECT id, first, last from PASSENGER WHERE id = ?");) {

            ps.setLong(1, 1);

            // NOTEZ le try à l'intérieur du try
            try (ResultSet rs = ps.executeQuery();) {
                System.out.println("records with id > 101");
                rs.next();
                return new Passenger(rs.getLong("id"), rs.getString("last"), rs.getString("first"));
            }
        } catch (SQLException e) {
            JDBCException.handleException(e);
            return null;
        }
    }
}