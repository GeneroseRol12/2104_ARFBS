package javaapplication1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class apartment_units extends javax.swing.JFrame {
    private Connection connection;

    public apartment_units() {
        initComponents();
        initializeDatabaseConnection();
        loadTableData();  // Load data into table when the frame is initialized
    }

    private void initializeDatabaseConnection() {
        try {
            connection = Connector.getConnection();
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void loadTableData() {
        String query = "SELECT UnitID, UnitType FROM apartment_units";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Unit ID");
            model.addColumn("Unit Type");
            model.addColumn("Tenant");
            model.addColumn("Start Date");
            model.addColumn("End Date");
            model.addColumn("Payment Status");

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("UnitID"),
                    resultSet.getString("UnitType"),
                    "",  
                    "",  
                    "",  
                    ""   
                });
            }

            
            jTable1.setModel(model);
            jTable1.setFillsViewportHeight(true);

        } catch (SQLException e) {
            System.out.println("Error loading data into table: " + e.getMessage());
        }
    }

    private void updateData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String unitId = (String) model.getValueAt(selectedRow, 0);
            String tenantName = (String) model.getValueAt(selectedRow, 2);
            String startDate = (String) model.getValueAt(selectedRow, 3);
            String endDate = (String) model.getValueAt(selectedRow, 4);
            String paymentStatus = (String) model.getValueAt(selectedRow, 5);

            String query = "UPDATE apartment_units SET Tenant = ?, StartDate = ?, EndDate = ?, PaymentStatus = ? WHERE UnitID = ?";

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, tenantName);
                ps.setString(2, startDate);
                ps.setString(3, endDate);
                ps.setString(4, paymentStatus);
                ps.setString(5, unitId);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data updated successfully!");
            } catch (SQLException e) {
                System.out.println("Error updating database: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    private void deleteData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String unitId = (String) model.getValueAt(selectedRow, 0);

            String query = "DELETE FROM apartment_units WHERE UnitID = ?";

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, unitId);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data deleted successfully!");
                model.removeRow(selectedRow);
            } catch (SQLException e) {
                System.out.println("Error deleting data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }
    
    private void searchData() {
    String searchQuery = txtUnitID.getText().trim();
    String query = "SELECT UnitID, UnitType FROM apartment_units WHERE UnitID LIKE ?";

    try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, "%" + searchQuery + "%");
        ResultSet resultSet = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (resultSet.next()) {
            model.addRow(new Object[]{
                resultSet.getString("UnitID"),
                resultSet.getString("UnitType"),
                "",
                "",
                "",
                ""
            });
        }

    } catch (SQLException e) {
        System.out.println("Error searching database: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "Error while searching data.");
      }
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTenant = new javax.swing.JLabel();
        lblStDate = new javax.swing.JLabel();
        lblEDate = new javax.swing.JLabel();
        txtTenant = new javax.swing.JTextField();
        txtStDate = new javax.swing.JTextField();
        txtEDate = new javax.swing.JTextField();
        lblUnitID = new javax.swing.JLabel();
        btnUpd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtUnitID = new javax.swing.JTextField();
        lblApartUnits = new javax.swing.JLabel();
        lblPay = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 111, 123));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        lblTenant.setText("Tenant:");

        lblStDate.setText("Start Date:");

        lblEDate.setText("End Date:");

        lblUnitID.setText("Unit ID:");

        btnUpd.setText("Update");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(65, 111, 123));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unit ID", "Unit Type", "Tenant", "Start Date", "End Date", "Payment Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
        );

        lblApartUnits.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblApartUnits.setText("Apartment Units");

        lblPay.setText("Payment Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApartUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStDate)
                            .addComponent(lblEDate)
                            .addComponent(lblPay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(lblUnitID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnitID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtStDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch))
                            .addComponent(txtEDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnUpd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDel))
                                .addComponent(txtPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblApartUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTenant)
                        .addComponent(txtTenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUnitID)
                        .addComponent(txtUnitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStDate)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPay))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpd)
                    .addComponent(btnDel))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        updateData();
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apartment_units().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApartUnits;
    private javax.swing.JLabel lblEDate;
    private javax.swing.JLabel lblPay;
    private javax.swing.JLabel lblStDate;
    private javax.swing.JLabel lblTenant;
    private javax.swing.JLabel lblUnitID;
    private javax.swing.JTextField txtEDate;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtStDate;
    private javax.swing.JTextField txtTenant;
    private javax.swing.JTextField txtUnitID;
    // End of variables declaration//GEN-END:variables
}
