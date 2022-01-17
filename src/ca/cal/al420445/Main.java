package ca.cal.al420445;

public class Main {

    public static void main(String[] args) {
        JDBCclass.createDatabase();
        JDBCclass.dropTable();

        JDBCclass.createDatabase();
        JDBCclass.insertRecords();
        JDBCclass.selectRecords();
        JDBCclass.updateRecord();
        JDBCclass.deleteRecord();
        JDBCclass.whereClause();
    }

}
