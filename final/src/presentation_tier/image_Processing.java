/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation_tier;

import data_tier.category;
import data_tier.charges;
import businesstier.operations;
import com.mathworks.toolbox.javabuilder.MWException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class image_Processing extends javax.swing.JFrame {

    int ID;
    int recieptNO;
    int INtime;
    int Outtime;
    int Date;
    String category;
    double price_per_hour;
    double total;
    String confirmation;
    String file_name = "";

    public image_Processing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(80, 40, 179, 151);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Browse image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 220, 117, 25);

        btnin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnin.setText("IN");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });
        jPanel1.add(btnin);
        btnin.setBounds(400, 120, 130, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 270, 170, 25);

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Car-Availability.jpg"))); // NOI18N
        lblimage.setText("jLabel1");
        jPanel1.add(lblimage);
        lblimage.setBounds(0, 0, 640, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileFilter ff = new FileNameExtensionFilter("images", "jpeg");
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(ff);
        int open = fc.showOpenDialog(this);

        if (open == javax.swing.JFileChooser.APPROVE_OPTION) {

            java.io.File path = fc.getSelectedFile();

            file_name = path.toString();

            try {
                BufferedImage bi = ImageIO.read(path);
                jToggleButton1.setIcon(new ImageIcon(bi));
            } catch (IOException e) {
            }

    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
 if(!file_name.equals("")){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String today = (dateFormat.format(date));

        DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
        Date date2 = new Date();
        String time = (dateFormat2.format(date2));

        
        
        operations o = new operations();
        try {
            int catID=1;
           // catID=o.Vehicleclassify(file_name);
            
            ArrayList<category> cat = new ArrayList<category>();
            cat = (o.Searchcategory(catID));
            String name = "";
            double price = 0;
            for (category c:cat) {
                name = c.getCategory();
                price = c.getPrice_per_hour();
            }
            ArrayList<charges> charge = new ArrayList<charges>();
            charges c = new charges();
            c.setCategory(name);
            c.setDate(today);
            c.setINtime(time);
            c.setPrice_per_hour(price);
            charge.add(c);
            int ID=o.Addcharges(charge);
            if (o.Addcharges(charge)!=0) {
                Bill b=new Bill();
                b.jbInit(ID,price,time,today,catID);
                JOptionPane.showMessageDialog(null, "Succesfully Added!");

            } else {
                JOptionPane.showMessageDialog(null, "Adding Failed!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryModification.class.getName()).log(Level.SEVERE, null, ex);
       } catch (Exception ex) {
         Logger.getLogger(image_Processing.class.getName()).log(Level.SEVERE, null, ex);
     }
 //        catch (MWException ex) {
//            Logger.getLogger(image_Processing.class.getName()).log(Level.SEVERE, null, ex);
//        }

 }
 else{
     JOptionPane.showMessageDialog(null, "Please add a image to continue the process");
 }
    }//GEN-LAST:event_btninActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Mainmenu m = new Mainmenu("");
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(image_Processing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(image_Processing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(image_Processing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(image_Processing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new image_Processing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblimage;
    // End of variables declaration//GEN-END:variables
}
