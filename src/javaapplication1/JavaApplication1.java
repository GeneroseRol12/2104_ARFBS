//Units

package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/arfbs";
        String user = "root";
        String password = "";
    
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
    
  
}