package dbms;

public class TenantDash extends javax.swing.JFrame {

    public TenantDash() {
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
        rules = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("AdminDashboard"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        pnl_Dashboard.setBackground(new java.awt.Color(204, 204, 204));

        pnl_Sidebar.setBackground(new java.awt.Color(65, 111, 123));
        pnl_Sidebar.setPreferredSize(new java.awt.Dimension(332, 514));

        pnl_Tenants.setBackground(new java.awt.Color(204, 204, 204));
        pnl_Tenants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_TenantsMouseClicked(evt);
            }
        });

        lbl_Tenants.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbl_Tenants.setText("APT INFO");

        javax.swing.GroupLayout pnl_TenantsLayout = new javax.swing.GroupLayout(pnl_Tenants);
        pnl_Tenants.setLayout(pnl_TenantsLayout);
        pnl_TenantsLayout.setHorizontalGroup(
            pnl_TenantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TenantsLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lbl_Tenants)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_TenantsLayout.setVerticalGroup(
            pnl_TenantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TenantsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_Tenants, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pnl_Apartments.setBackground(new java.awt.Color(65, 111, 123));
        pnl_Apartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_ApartmentsMouseClicked(evt);
            }
        });

        lbl_Apartments.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbl_Apartments.setText("PAY BILLS");

        javax.swing.GroupLayout pnl_ApartmentsLayout = new javax.swing.GroupLayout(pnl_Apartments);
        pnl_Apartments.setLayout(pnl_ApartmentsLayout);
        pnl_ApartmentsLayout.setHorizontalGroup(
            pnl_ApartmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ApartmentsLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lbl_Apartments)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        lbl_Billing.setText("PAY RENT");

        javax.swing.GroupLayout pnl_BillingLayout = new javax.swing.GroupLayout(pnl_Billing);
        pnl_Billing.setLayout(pnl_BillingLayout);
        pnl_BillingLayout.setHorizontalGroup(
            pnl_BillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BillingLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lbl_Billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136))
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

        pnl_TenantsWindow.setBackground(new java.awt.Color(204, 204, 204));
        pnl_TenantsWindow.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                pnl_TenantsWindowInputMethodTextChanged(evt);
            }
        });
        pnl_TenantsWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rulesMouseClicked(evt);
            }
        });

        textarea.setBackground(new java.awt.Color(204, 204, 204));
        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        textarea.setRows(5);
        textarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textareaMouseClicked(evt);
            }
        });
        rules.setViewportView(textarea);

        pnl_TenantsWindow.add(rules, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1210, 770));

        text.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        text.setText("APARTMENT RULES AND REGULATIONS");
        pnl_TenantsWindow.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 740, 40));

        javax.swing.GroupLayout pnl_DashboardLayout = new javax.swing.GroupLayout(pnl_Dashboard);
        pnl_Dashboard.setLayout(pnl_DashboardLayout);
        pnl_DashboardLayout.setHorizontalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DashboardLayout.createSequentialGroup()
                .addComponent(pnl_Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_TenantsWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 1599, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_DashboardLayout.setVerticalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addComponent(pnl_TenantsWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
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
        
    }//GEN-LAST:event_pnl_TenantsMouseClicked

    private void pnl_ApartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_ApartmentsMouseClicked
        new TenantDashPayBills().setVisible(true);
    }//GEN-LAST:event_pnl_ApartmentsMouseClicked

    private void pnl_BillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_BillingMouseClicked
        
    }//GEN-LAST:event_pnl_BillingMouseClicked

    private void textareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textareaMouseClicked
        // TODO add your handling code here:
        textarea.setText( "1. GENERAL\n\n"
            + " 1.1 AGREEMENT ADDENDUM\n"
            + "     This document is an addendum to the rental agreement between the Landlord/Manager and the Tenant. It is an essential part of "
            + "\n     the agreement and is legally binding.\n\n"
            + " 1.2 TENANT RESPONSIBILITY\n"
            + "     The Tenant is responsible for ensuring that they, their guests, and any other occupants of the apartment adhere to these rules at all"
            + "\n     times.\n\n"
            + " 1.3 COMMUNICATION"
            + "\n"
            + "     Any notices, updates, or changes to these rules will be communicated in writing. The Tenant is required to stay informed by checking"
                + "\n     any communication from the Landlord/Manager.\n\n"
            + "2. NOISE AND CONDUCT\n\n"
            + " 2.1 QUIET HOURS\n"
            + "     Tenants must maintain a quiet environment, especially during designated quiet hours, typically from 10:00 PM to 7:00 AM. Loud"
            + "\n     noises, music, or disturbances are not allowed during these hours.\n\n"
            + " 2.2 RESPECTFUL BEHAVIOR\n"
            + "     Tenants must behave in a manner that is respectful to neighbors and other residents. Harassment, verbal abuse, or any behavior"
            + "\n     that disturbs others will not be tolerated.\n\n"
            + " 2.3 GUEST CONDUCT\n"
            + "     The Tenant is responsible for the behavior of their guests. Guests must also follow the rules and regulations of the property. "
            + "\n     If a guest causes damage or disturbances, the Tenant will be held accountable.\n\n"
            + " 2.4 NO SMOKING\n"
            + "     Smoking is prohibited in all indoor common areas, hallways, and other non-designated smoking areas. Smoking in individual"
            + "\n     apartments is subject to the terms in the lease agreement.\n\n"
            + "3. CLEANLINESS AND TRASH\n\n"
            + " 3.1 APARTMENT CLEANLINESS\n"
            + "     Tenants must maintain the cleanliness and condition of their apartment. The apartment should be kept free of clutter, dirt, and"
            + "\n     pests at all times.\n\n"
            + " 3.2 COMMON AREA AND CLEANLINESS\n"
            + "     Tenants are expected to respect common areas such as hallways, stairs, and entrances. These areas must be kept clean, and tenants"
            + "\n     should not leave personal items or trash in these spaces.\n\n"
            + " 3.3 TRASH DISPOSAL\n"
            + "     Trash must be disposed of properly in designated trash bins or recycling containers. Overflowing or improperly disposed of trash "
            + "will \n     be subject to fines. Tenants must ensure that any bulk items (e.g., furniture or appliances) are disposed of following the "
            + "\n     community guidelines.\n\n"
            + " 3.4 PEST CONTROL\n"
            + "     The Tenant is responsible for maintaining a pest-free environment in their apartment. If there is a pest issue, it should be reported"
            + "\n     to the Landlord/Manager promptly for appropriate action.\n\n"
            + "4. SAFETY\n\n"
            + " 4.1 FIRE SAFETY\n"
            + "     Tenants must follow fire safety rules, including not blocking fire exits, keeping fire escapes clear, and ensuring that smoke detectors "
            + "\n     and fire extinguishers are not tampered with.\n\n"
            + " 4.2 EMERGENCY PROCEDURES\n"
            + "     Tenants must familiarize themselves with emergency exits, evacuation routes, and the locations of fire extinguishers and first aid "
            + "\n     kits. In case of emergency, follow the instructions of the Landlord/Manager and local authorities.\n\n"
            + " 4.3 SECURITY\n"
            + "     The Tenant must ensure that windows and doors are properly secured when leaving the apartment. The Tenant must not duplicate"
            + "\n     or share keys with unauthorized persons. If keys or access cards are lost, they must be reported immediately.\n\n"
            + " 4.4 PROPERTY DAMAGE\n"
            + "     The Tenant is responsible for reporting any damage or unsafe conditions (e.g., broken locks, exposed wiring) to the Landlord/"
            + "\n     Manager. Failure to report hazards may result in fines or liability for additional damages.\n");
    }//GEN-LAST:event_textareaMouseClicked

    private void pnl_TenantsWindowInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_pnl_TenantsWindowInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_TenantsWindowInputMethodTextChanged

    private void rulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rulesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rulesMouseClicked
  
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TenantDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Apartments;
    private javax.swing.JLabel lbl_Billing;
    private javax.swing.JLabel lbl_Tenants;
    private javax.swing.JPanel pnl_Apartments;
    private javax.swing.JPanel pnl_Billing;
    private javax.swing.JPanel pnl_Dashboard;
    private javax.swing.JPanel pnl_Sidebar;
    private javax.swing.JPanel pnl_Tenants;
    private javax.swing.JPanel pnl_TenantsWindow;
    private javax.swing.JScrollPane rules;
    private javax.swing.JLabel text;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
