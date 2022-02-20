package ca.cal.bibliotheque.persistance.CRUD;

import ca.cal.bibliotheque.persistance.DB.JDBCConfig;
import ca.cal.bibliotheque.persistance.DB.JDBCException;

import java.sql.*;

public class JDBCBibliotheque {
    public static void enregistrer(String sql) {
        try(Connection conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            JDBCException.handleException(e);
        }
    }
}