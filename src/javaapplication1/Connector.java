//Units

package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static final String URL = "jdbc:mysql://localhost:3306/apartment_rental";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        
        public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new apartment_units().setVisible(true);
        });
        }
}