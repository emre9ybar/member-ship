package entitymanager;

import java.sql.Connection;

public class EntityManager {
    Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }


}
