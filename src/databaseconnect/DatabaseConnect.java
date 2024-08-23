package databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

  private  Connection connection;

  public Connection connectToDatabase(){
      try {
          Class.forName("org.postgresql.Driver");
           connection = DriverManager.getConnection(
                  DatabaseConfig.DATABASE_URL,
                  DatabaseConfig.DATABASE_USER,
                  DatabaseConfig.DATABASE_PASSWORD);
          if (connection!=null){
              System.out.println("Connected ok");
          }else {
              System.out.println("Connected failed");
          }
      }catch (ClassNotFoundException e){
          throw new RuntimeException("Class not found driver",e);
      }
      catch (Exception e){
          throw new RuntimeException("Connected not failed");
      }
      return connection;
  }



 /* public Connection connectToDatabase(){
      try {
          Class.forName("org.postgresql.Driver");
          connection=DriverManager.getConnection(
                  DatabaseConfig.DATABASE_URL,
                  DatabaseConfig.DATABASE_USER,
                  DatabaseConfig.DATABASE_PASSWORD);
          if (connection!=null){
              System.out.println("Connected ok");
          }else {
              System.out.println("Connected failed");
          }
      }catch (ClassNotFoundException e){
          throw new RuntimeException("PostgreSQL Driver not found", e);
      }catch (Exception e){
          throw new RuntimeException("Failed to connect to the database");
      }
      return connection;
  }*/

  public Connection getConnection(){
      return connection;
  }
  public void closeConnection() {
      if (connection!=null){
          try {
              connection.close();
              System.out.println("Connection closed");
          } catch (SQLException e) {
              throw new RuntimeException("Failed to close the database connection", e);
          }
      }

  }













   /* private Connection connection;*/

    /*public Connection connectToDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    DatabaseConfig.DATABASE_URL,
                    DatabaseConfig.DATABASE_USER,
                    DatabaseConfig.DATABASE_PASSWORD
            );
            if (connection != null) {
                System.out.println("Connected Ok");
            } else {
                System.out.println("Connection is not established.");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("PostgreSQL Driver not found", e);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to the database", e);
        }
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }*/
}
