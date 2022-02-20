package ca.cal.bibliotheque.persistance;

import org.h2.jdbc.JdbcSQLSyntaxErrorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateDB {
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void createDatabase() {
        try {
            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());

            //STEP 3: Execute a query
            createTables();

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(JdbcSQLSyntaxErrorException e) {
            // Database already exists
            JDBCException.handleException(e);
        } catch(SQLException se) {
            //Handle errors for JDBC
            JDBCException.handleException(se);
        } catch(Exception e) {
            //Handle errors for Class.forName
            JDBCException.handleException(e);
        } finally {
            //finally, block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                JDBCException.handleException(se);
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
    }

    private static void createTables() {
        System.out.println("Creating tables in given database...");
        createCD();
        createClients();
        createDVD();
        createEmploye();
        createEmpruntDocument();
        createLivre();
        createReservation();
        System.out.println("Created tables in given database...");
    }

    private static void createTable(String sql) {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
//a poursuivre...
        }
    }

    private static String createDocuments() {
        return " genreDocument VARCHAR(255), " +
                " etatDocument VARCHAR(255), " +
                " titre VARCHAR(255), " +
                " auteur VARCHAR(255), " +
                " editeur VARCHAR(255), " +
                " anneePublication INTEGER";
    }

    private static void createCD() {
        createTable("CREATE TABLE CD " +
                "(id INTEGER not NULL, " +
                createDocuments() + ", " +
                " genreMusique VARCHAR(255), " +
                " compositeur VARCHAR(255), " +
                " interprete VARCHAR(255), " +
                " PRIMARY KEY ( id ))");
    }

    private static void createClients() {
        createTable("CREATE TABLE CLIENTS " +
                "(id INTEGER not NULL, " +
                " nom VARCHAR(255), " +
                " prenom VARCHAR(255), " +
                " rue VARCHAR(255), " +
                " ville VARCHAR(255), " +
                " codePostal VARCHAR(255), " +
                " numeroTelephone VARCHAR(255), " +
                " dateInscription Date, " +
                " nbrEmpruntEnCour INTEGER, " +
                " PRIMARY KEY ( id ))");
    }

    private static void createDVD() {
        createTable("CREATE TABLE DVD " +
                "(id INTEGER not NULL, " +
                createDocuments() + ", " +
                " duree INTEGER, " +
                " genreFilm VARCHAR(255), " +
                " PRIMARY KEY ( id ))");
    }

    private static void createEmploye() {
        createTable("CREATE TABLE EMPLOYE " +
                "(id INTEGER not NULL, " +
                " nom VARCHAR(255), " +
                " prenom VARCHAR(255), " +
                " fonction VARCHAR(255), " +
                " PRIMARY KEY ( id ))");
    }

    private static void createEmpruntDocument() {
        createTable("CREATE TABLE EMPRUNTDOCUMENT " +
                "(id INTEGER not NULL, " +
                " dateInitial DATE, " +
                " dateExpire DATE, " +
                " nbrRappel INTEGER, " +
                " PRIMARY KEY ( id ), " +
                " CONSTRAINT fk_empruntDocument_id_client FOREIGN KEY (idClient) REFERENCES CLIENTS" +
                ")");
    }

    private static void createLivre() {
        createTable("CREATE TABLE LIVRE " +
                "(id INTEGER not NULL, " +
                createDocuments() + ", " +
                " nbrPages INTEGER, " +
                " genreLivre VARCHAR(255), " +
                " PRIMARY KEY ( id ))");
    }

    private static void createReservation() {
        createTable("CREATE TABLE RESERVATION " +
                "(id INTEGER not NULL, " +
                " dateReservation DATE, " +
                " idClient INTEGER not NULL, " +
                " PRIMARY KEY ( id ), " +
                " CONSTRAINT fk_reservation_id_client FOREIGN KEY (idClient) REFERENCES CLIENTS" +
                ")");
    }
}
