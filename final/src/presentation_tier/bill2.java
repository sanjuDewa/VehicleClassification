/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation_tier;

import businesstier.operations;
import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import static com.sun.org.apache.bcel.internal.classfile.Utility.format;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.xml.internal.bind.unmarshaller.Messages.format;
import java.awt.Dimension;
import java.awt.print.Printable;
import java.security.Timestamp;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanju
 */
public abstract class bill2 extends javax.swing.JFrame implements Printable {// class for hanlde adding items for gas sales and quantity

    JFrame frame = new JFrame();// create jframe 

    public void jbout(int ID, double price, String time, String outtime, String today, int catID, String total) throws Exception {
        /* create table and add data to create header in the bill*/

        frame.setMinimumSize(new Dimension(300, 0));  //give size to frame
        // create table to add billing body details
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn(" ");
        model1.addRow(new Object[]{"Parking Area"});
        model1.addRow(new Object[]{"130, Highlevel road"});
        model1.addRow(new Object[]{"Nugegoda"});
        model1.addRow(new Object[]{"0113564567"});
        model1.addRow(new Object[]{today + " " + time});

        model1.addRow(new Object[]{""});
        model1.addRow(new Object[]{"Category: " + catID});
        model1.addRow(new Object[]{"Price per hour: " + price});
         model1.addRow(new Object[]{"Total: " + today+"" +time+" "});
    }

    void jbout(int ID, double price, String time, String today, int catID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
