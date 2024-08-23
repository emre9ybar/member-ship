import databaseconnect.DatabaseConnect;
import entity.User;
import tablemanager.BaseTable;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        DatabaseConnect databaseConnect = new DatabaseConnect();
        Connection connection = databaseConnect.connectToDatabase();

        User user =new User();
        BaseTable tableManager = new BaseTable(connection);
        tableManager.createTable(user);





    }
}
