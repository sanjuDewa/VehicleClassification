/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation_tier;

import data_tier.category;
import data_tier.charges;

/**
 *
 * @author sanju
 */
public class Mainmenu extends javax.swing.JFrame {

    private static String type = "";

    public Mainmenu(String type) {
        initComponents();
        this.type = type;

        if (type.equalsIgnoreCase("Admin")) {
            btncategory.setEnabled(true);
            btncharge.setEnabled(true);
            btnpayments.setEnabled(true);
        } 
        else 
        {
            {
                btnsignup.setEnabled(true);
                btncategory.setEnabled(false);
                btncharge.setEnabled(true);
                btnpayments.setEnabled(false);

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlog = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        btnpayments = new javax.swing.JButton();
        btncharge = new javax.swing.JButton();
        btncategory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnlog.setBackground(new java.awt.Color(153, 153, 153));
        btnlog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnlog.setText("Login");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });
        getContentPane().add(btnlog);
        btnlog.setBounds(86, 46, 270, 30);

        btnsignup.setBackground(new java.awt.Color(153, 153, 153));
        btnsignup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsignup.setText("signup");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup);
        btnsignup.setBounds(86, 87, 270, 30);

        btnpayments.setBackground(new java.awt.Color(153, 153, 153));
        btnpayments.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnpayments.setText("Payments");
        btnpayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnpayments);
        btnpayments.setBounds(86, 128, 270, 30);

        btncharge.setBackground(new java.awt.Color(153, 153, 153));
        btncharge.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btncharge.setText("Charges");
        btncharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchargeActionPerformed(evt);
            }
        });
        getContentPane().add(btncharge);
        btncharge.setBounds(86, 169, 270, 30);

        btncategory.setBackground(new java.awt.Color(153, 153, 153));
        btncategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btncategory.setText("Category");
        btncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btncategory);
        btncategory.setBounds(86, 218, 270, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 480, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchargeActionPerformed
        chargess ch = new chargess();
        ch.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnchargeActionPerformed

    private void btncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryActionPerformed
        CategoryModification cat = new CategoryModification();
        cat.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncategoryActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        signup sn = new signup(type);
        sn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        login lg = new login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnpaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentsActionPerformed
        image_Processing im = new image_Processing();
        im.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnpaymentsActionPerformed

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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu(type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncategory;
    private javax.swing.JButton btncharge;
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnpayments;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
