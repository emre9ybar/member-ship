package tablemanager;

import java.sql.Connection;
import java.sql.Statement;

public class BaseTable {
    Connection connection;

    public BaseTable(Connection connection) {
        this.connection = connection;
    }

    public BaseTable() {
    }

    public void createTable(Table table) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + table.getTableName() + " (" + table.getTableSchema() + ")";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Created Table :" + table.getTableName());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Created not failed table.");
        }
    }



}
