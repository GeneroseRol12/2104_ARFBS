package FrontEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;



public class AdminDashboard extends javax.swing.JFrame {

    private TableModel tblModel;

    public AdminDashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Dashboard = new javax.swing.JPanel();
        pnl_Sidebar = new javax.swing.JPanel();
        pnl_Tenants = new javax.swing.JPanel();
        lbl_Tenants = new javax.swing.JLabel();
        pnl_Apartments = new javax.swing.JPanel();
        lbl_Apartments = new javax.swing.JLabel();
        pnl_Billing = new javax.swing.JPanel();
        lbl_Billing = new javax.swing.JLabel();
        pnl_TenantsWindow = new javax.swing.JPanel();
        pnl_TenantsTable = new javax.swing.JPanel();
        pnl_ApartmentsWindow = new javax.swing.JPanel();
        pnl_BillingWindow = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("AdminDashboard"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        pnl_Dashboard.setBackground(new java.awt.Color(204, 204, 204));

        pnl_Sidebar.setBackground(new java.awt.Color(65, 111, 123));

        pnl_Tenants.setBackground(new java.awt.Color(65, 111, 123));
        pnl_Tenants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_TenantsMouseClicked(evt);
            }
        });

        lbl_Tenants.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbl_Tenants.setText("TENANTS");

        javax.swing.GroupLayout pnl_TenantsLayout = new javax.swing.GroupLayout(pnl_Tenants);
        pnl_Tenants.setLayout(pnl_TenantsLayout);
        pnl_TenantsLayout.setHorizontalGroup(
            pnl_TenantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TenantsLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lbl_Tenants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );
        pnl_TenantsLayout.setVerticalGroup(
            pnl_TenantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TenantsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Tenants, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pnl_Apartments.setBackground(new java.awt.Color(65, 111, 123));
        pnl_Apartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_ApartmentsMouseClicked(evt);
            }
        });

        lbl_Apartments.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbl_Apartments.setText("APARTMENTS");

        javax.swing.GroupLayout pnl_ApartmentsLayout = new javax.swing.GroupLayout(pnl_Apartments);
        pnl_Apartments.setLayout(pnl_ApartmentsLayout);
        pnl_ApartmentsLayout.setHorizontalGroup(
            pnl_ApartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ApartmentsLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lbl_Apartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );
        pnl_ApartmentsLayout.setVerticalGroup(
            pnl_ApartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ApartmentsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Apartments, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pnl_Billing.setBackground(new java.awt.Color(65, 111, 123));
        pnl_Billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_BillingMouseClicked(evt);
            }
        });

        lbl_Billing.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbl_Billing.setText("BILLING");

        javax.swing.GroupLayout pnl_BillingLayout = new javax.swing.GroupLayout(pnl_Billing);
        pnl_Billing.setLayout(pnl_BillingLayout);
        pnl_BillingLayout.setHorizontalGroup(
            pnl_BillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BillingLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(lbl_Billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(122, 122, 122))
        );
        pnl_BillingLayout.setVerticalGroup(
            pnl_BillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_BillingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Billing, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout pnl_SidebarLayout = new javax.swing.GroupLayout(pnl_Sidebar);
        pnl_Sidebar.setLayout(pnl_SidebarLayout);
        pnl_SidebarLayout.setHorizontalGroup(
            pnl_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Tenants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_Apartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_Billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_SidebarLayout.setVerticalGroup(
            pnl_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SidebarLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(pnl_Tenants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Apartments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Billing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_TenantsWindow.setBackground(new java.awt.Color(255, 204, 204));
        pnl_TenantsWindow.setLayout(new java.awt.CardLayout());

        pnl_TenantsTable.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnl_TenantsTableLayout = new javax.swing.GroupLayout(pnl_TenantsTable);
        pnl_TenantsTable.setLayout(pnl_TenantsTableLayout);
        pnl_TenantsTableLayout.setHorizontalGroup(
            pnl_TenantsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1599, Short.MAX_VALUE)
        );
        pnl_TenantsTableLayout.setVerticalGroup(
            pnl_TenantsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );

        pnl_TenantsWindow.add(pnl_TenantsTable, "card2");

        pnl_ApartmentsWindow.setBackground(new java.awt.Color(204, 204, 255));
        pnl_ApartmentsWindow.setLayout(new java.awt.CardLayout());

        pnl_BillingWindow.setBackground(new java.awt.Color(255, 255, 204));
        pnl_BillingWindow.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnl_DashboardLayout = new javax.swing.GroupLayout(pnl_Dashboard);
        pnl_Dashboard.setLayout(pnl_DashboardLayout);
        pnl_DashboardLayout.setHorizontalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DashboardLayout.createSequentialGroup()
                .addComponent(pnl_Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_TenantsWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 1599, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DashboardLayout.createSequentialGroup()
                    .addGap(0, 319, Short.MAX_VALUE)
                    .addComponent(pnl_ApartmentsWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 1601, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DashboardLayout.createSequentialGroup()
                    .addGap(0, 319, Short.MAX_VALUE)
                    .addComponent(pnl_BillingWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 1601, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_DashboardLayout.setVerticalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_TenantsWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_ApartmentsWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_BillingWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_TenantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_TenantsMouseClicked
        pnl_TenantsWindow.setVisible(true);
        pnl_ApartmentsWindow.setVisible(false);
        pnl_BillingWindow.setVisible(false);
    }//GEN-LAST:event_pnl_TenantsMouseClicked

    private void pnl_ApartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_ApartmentsMouseClicked
        pnl_TenantsWindow.setVisible(false);
        pnl_ApartmentsWindow.setVisible(true);
        pnl_BillingWindow.setVisible(false);
    }//GEN-LAST:event_pnl_ApartmentsMouseClicked

    private void pnl_BillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BillingMouseClicked
        pnl_TenantsWindow.setVisible(false);
        pnl_ApartmentsWindow.setVisible(false);
        pnl_BillingWindow.setVisible(true);
    }//GEN-LAST:event_pnl_BillingMouseClicked

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Apartments;
    private javax.swing.JLabel lbl_Billing;
    private javax.swing.JLabel lbl_Tenants;
    private javax.swing.JPanel pnl_Apartments;
    private javax.swing.JPanel pnl_ApartmentsWindow;
    private javax.swing.JPanel pnl_Billing;
    private javax.swing.JPanel pnl_BillingWindow;
    private javax.swing.JPanel pnl_Dashboard;
    private javax.swing.JPanel pnl_Sidebar;
    private javax.swing.JPanel pnl_Tenants;
    private javax.swing.JPanel pnl_TenantsTable;
    private javax.swing.JPanel pnl_TenantsWindow;
    // End of variables declaration//GEN-END:variables
}
