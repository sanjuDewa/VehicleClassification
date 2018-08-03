/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation_tier;

import businesstier.operations;
import data_tier.user;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sanju
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    private static String type="Admin";
    public signup(String type) {
        initComponents();
        this.type=type;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox<>();
        txtun = new javax.swing.JTextField();
        txtpw = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnbacksignup = new javax.swing.JButton();
        btnexitsignup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 28, 79));
        jLabel1.setText("Username :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 80, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 28, 79));
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 28, 79));
        jLabel3.setText("Name       :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 80, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 28, 79));
        jLabel4.setText("NIC          :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 80, 14);

        cmbtype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbtype.setForeground(new java.awt.Color(239, 28, 79));
        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin ", "Security officer" }));
        getContentPane().add(cmbtype);
        cmbtype.setBounds(80, 200, 100, 20);

        txtun.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        getContentPane().add(txtun);
        txtun.setBounds(110, 40, 190, 30);

        txtpw.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        getContentPane().add(txtpw);
        txtpw.setBounds(110, 80, 190, 30);

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(110, 120, 190, 30);

        txtNIC.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        getContentPane().add(txtNIC);
        txtNIC.setBounds(110, 160, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 28, 79));
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 240, 100, 23);

        btnbacksignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbacksignup.setForeground(new java.awt.Color(239, 28, 79));
        btnbacksignup.setText("Back");
        btnbacksignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacksignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnbacksignup);
        btnbacksignup.setBounds(170, 240, 90, 23);

        btnexitsignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexitsignup.setForeground(new java.awt.Color(239, 28, 79));
        btnexitsignup.setText("Exit");
        btnexitsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnexitsignup);
        btnexitsignup.setBounds(280, 240, 80, 23);

        jLabel6.setForeground(new java.awt.Color(239, 28, 79));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 490, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String password = txtun.getText();
        String username = txtpw.getText();
        String name = txtname.getText();
        String NIC = txtNIC.getText();
        String Usertype = cmbtype.getSelectedItem().toString();
       
        operations o=new operations();
        ArrayList<user> user=new ArrayList<user>();
        user u=new user();
        u.setUsername(username);
        u.setPassword(password);
        u.setName(name);
        u.setNIC(NIC);
        u.setType(Usertype);
        user.add(u); 
        try {
            if(o.signup(user)){
                JOptionPane.showMessageDialog(null, "Succesfully Signup!");
               
               }
            else{
            JOptionPane.showMessageDialog(null, "Signup Failed!");
        }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbacksignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacksignupActionPerformed
         Mainmenu m=new Mainmenu(type);
         this.dispose();
         m.setVisible(true);
    }//GEN-LAST:event_btnbacksignupActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnexitsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitsignupActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitsignupActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup(type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacksignup;
    private javax.swing.JButton btnexitsignup;
    private javax.swing.JComboBox<String> cmbtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables
}