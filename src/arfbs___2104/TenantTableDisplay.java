package arfbs___2104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TenantTableDisplay extends JFrame {

    public TenantTableDisplay() {
        // Table setup
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Tenant ID", "Tenant Name", "Unit ID", "Unit Type", "Rent Status"}, 0);
        table.setModel(model);

        // Database connection setup
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ARFBS", "root", ""); // Adjust username and password if needed
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Tenants";
            ResultSet rs = stmt.executeQuery(query);

            // Populate table with data from ResultSet
            while (rs.next()) {
                int tenantId = rs.getInt("tenant_id");
                String tenantName = rs.getString("tenant_name");
                int unitId = rs.getInt("unit_id");
                String unitType = rs.getString("unit_type");
                String rentStatus = rs.getString("rent_status");
                
                model.addRow(new Object[]{tenantId, tenantName, unitId, unitType, rentStatus});
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display table in JFrame
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        setTitle("Tenants Table");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TenantTableDisplay();
    }
}
