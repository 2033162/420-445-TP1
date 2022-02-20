package ca.cal.bibliotheque.persistance;

import ca.cal.bibliotheque.model.Document.Passenger;
import org.h2.jdbc.JdbcSQLSyntaxErrorException;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.*;

public class JDBCBibliothequeH2 implements JDBCBibliotheque {

    private static Connection conn = null;
    private static Statement stmt = null;

    public static void createDatabase() {
        try {
            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBCConfig.getDbUrl(),JDBCConfig.getUSER(),JDBCConfig.getPASS());

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE PASSENGER " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(JdbcSQLSyntaxErrorException e) {
            // Database already exists
            handleException(e);
        } catch(SQLException se) {
            //Handle errors for JDBC
            handleException(se);
        } catch(Exception e) {
            //Handle errors for Class.forName
            handleException(e);
        } finally {
            //finally, block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                handleException(se);
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
    }

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
            handleException(e);
        }
    }

    private static void handleException(Exception exception) {
        if (exception instanceof SQLException) {
            SQLException sqlException = (SQLException) exception;
            System.out.println("Error Code: " + sqlException.getErrorCode());
            System.out.println("SQL State: " + sqlException.getSQLState());
        }
        System.out.println("SQLException message: " + exception.getMessage());
        System.out.println("Stacktrace: ");
        exception.printStackTrace();
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
            handleException(e);
            return null;
        }
    }
}