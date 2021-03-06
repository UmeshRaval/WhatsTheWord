/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatstheword;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
/**
 *
 * @author admin
 */
public class UserLogin extends javax.swing.JFrame {
    private static ConnectorMXJObjectTestExample db;
    private static Home home;
    /**
     * Creates new form UserLogin
     */
    public UserLogin() throws Exception {
        UserLogin.db = new ConnectorMXJObjectTestExample();
        UserLogin.home = new Home();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        staffUsername = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        staffPassw = new javax.swing.JPasswordField();
        staffLoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1155, 575));

        jPanel1.setLayout(null);

        staffUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(staffUsername);
        staffUsername.setBounds(160, 250, 259, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Username");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(160, 220, 258, 21);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel32.setText("Phone Number");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(160, 290, 259, 16);
        jPanel1.add(staffPassw);
        staffPassw.setBounds(160, 309, 259, 30);

        staffLoginButton.setText("Login");
        staffLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(staffLoginButton);
        staffLoginButton.setBounds(160, 360, 259, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whatstheword/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginButtonActionPerformed
        LinkedHashMap<String,String> info = db.getUsers();
        String userName = staffUsername.getText();
        String passw = staffPassw.getText();
        for (Map.Entry<String,String> entry : info.entrySet()) {
            if(userName.equals(entry.getKey()) && passw.equals(entry.getValue())){
                JOptionPane.showMessageDialog(this, "Login Succesful");
                this.setVisible(false);
                home.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "The Username or Password is Incorrect Please Try Again");

    }//GEN-LAST:event_staffLoginButtonActionPerformed

    private void staffUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new UserLogin().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton staffLoginButton;
    private javax.swing.JPasswordField staffPassw;
    private javax.swing.JTextField staffUsername;
    // End of variables declaration//GEN-END:variables
}































