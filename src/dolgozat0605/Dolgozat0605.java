
package dolgozat0605;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dolgozat0605 {

    public static void main(String[] args) {
String url="http://localhost/phpmyadmin/";
String dbName = "dolgozat0605";
String user = "root@localhost";
String password = "password";
try (Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement()) {
String createDBQuery = "CREATE DATABASE " + dbName + "COLLATE utf8_hungarian_ci;";
    statement.executeUpdate (createDBQuery);

System.out.println("Az adatbázis létrehozva.");
}
  catch (SQLException e) {
  System.out.println("Hiba történt az adatbázis létrehozása közben:");
  e.printStackTrace();
  }      
    }
    
}
