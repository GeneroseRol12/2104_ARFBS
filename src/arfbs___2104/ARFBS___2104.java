/*
Apartment Rental and Facilities Billing System
*/

package arfbs___2104;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

public class ARFBS___2104 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ARFBS"; 
        String user = "root"; 
        String password = "";
        
        try { Connection conn = DriverManager.getConnection(url, user, password); 
        System.out.println("Connected to the MySQL database!"); 
        } catch (SQLException e) { 
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
    
}
