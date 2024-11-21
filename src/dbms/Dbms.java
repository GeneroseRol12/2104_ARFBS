package dbms;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

public class Dbms {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/2104_arfbs"; 
        String user = "root"; 
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password); 
            System.out.println("Connected to the MySQL database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    public static Connection mycon() {
        Connection con = null;
        
        try {
            // Updated the driver class name for newer versions of MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Fixed the typo and provided the correct syntax
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2104_arfbs", "root", "");
            System.out.println("Connection established in mycon method.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed in mycon method!");
            e.printStackTrace();
        }

        return con;   
    }
   
}
