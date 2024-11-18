/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbms;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class signin extends javax.swing.JFrame {

    public signin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        juser = new javax.swing.JTextField();
        jlog1 = new javax.swing.JButton();
        jemail = new javax.swing.JTextField();
        jpasss = new javax.swing.JPasswordField();
        jcpass = new javax.swing.JPasswordField();
        jshoww = new javax.swing.JCheckBox();
        jshowww = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jusern = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juser.setBackground(new java.awt.Color(204, 204, 204));
        juser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        getContentPane().add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 320, 230, 30));

        jlog1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlog1.setText("SIGN UP");
        jlog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlog1ActionPerformed(evt);
            }
        });
        getContentPane().add(jlog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 600, 150, -1));

        jemail.setBackground(new java.awt.Color(204, 204, 204));
        jemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        getContentPane().add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, 230, 30));

        jpasss.setBackground(new java.awt.Color(204, 204, 204));
        jpasss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasssActionPerformed(evt);
            }
        });
        getContentPane().add(jpasss, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 440, 230, 30));

        jcpass.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 530, 230, 30));

        jshoww.setForeground(new java.awt.Color(255, 255, 255));
        jshoww.setText("Show password");
        jshoww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowwActionPerformed(evt);
            }
        });
        getContentPane().add(jshoww, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 480, -1, -1));

        jshowww.setForeground(new java.awt.Color(255, 255, 255));
        jshowww.setText("Show password");
        jshowww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowwwActionPerformed(evt);
            }
        });
        getContentPane().add(jshowww, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 570, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confiirm password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 80, 30));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 105)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("is right here.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 520, 100));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 110)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("The best place");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 650, 110));

        jusern.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jusern.setForeground(new java.awt.Color(255, 255, 255));
        jusern.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jusern.setText("Username");
        getContentPane().add(jusern, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 290, 80, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 350, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\background (2).png")); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        setSize(new java.awt.Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void jlog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlog1ActionPerformed
        
        String nam = juser.getText();
        String email = jemail.getText();
        String pass = jpasss.getText();
        String cpass = jcpass.getText();
        
        String sql = "INSERT INTO login (Username, Email, Password) VALUES (?, ?, ?)";

    try (PreparedStatement pstmt = Dbms.mycon().prepareStatement(sql)) {
    pstmt.setString(1, nam);
    pstmt.setString(2, email);
    pstmt.setString(3, pass);
    
    pstmt.executeUpdate(); // Execute the prepared statement
    
    JOptionPane.showMessageDialog(rootPane, "Account Successfully Created. Login now!!");
    
    this.setVisible(false);
    new login().setVisible(true);
    } catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Error occurred: " + e.getMessage());
    e.printStackTrace();
}
      /* try {
             Statement s = Dbms.mycon().createStatement();
             String sql = "INSERT INTO login (Username, Email, Password) VALUES ('" + nam + "','" + email + "','" + pass + "')";
             s.executeUpdate(sql); 
            
            JOptionPane.showMessageDialog(rootPane, "Account Succesfully Created. Login now!!");
            
            this.setVisible(false);
            new login().setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        juser.setText("");
        jemail.setText("");
        jpasss.setText("");
        jcpass.setText("");
       */
    }//GEN-LAST:event_jlog1ActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jpasssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasssActionPerformed

    private void jshowwwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowwwActionPerformed
        // TODO add your handling code here:
        if(jshowww.isSelected()) {
            jcpass.setEchoChar((char)0);
        }
        else {
            jcpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jshowwwActionPerformed

    private void jshowwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowwActionPerformed
        // TODO add your handling code here:
        if(jshoww.isSelected()) {
            jpasss.setEchoChar((char)0);
        }
        else {
            jpasss.setEchoChar('*');
        }
    }//GEN-LAST:event_jshowwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jcpass;
    private javax.swing.JTextField jemail;
    private javax.swing.JButton jlog1;
    private javax.swing.JPasswordField jpasss;
    private javax.swing.JCheckBox jshoww;
    private javax.swing.JCheckBox jshowww;
    private javax.swing.JTextField juser;
    private javax.swing.JLabel jusern;
    // End of variables declaration//GEN-END:variables
}
