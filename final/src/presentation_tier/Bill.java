/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation_tier;

import data_tier.charges;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanju
 */
public class Bill extends javax.swing.JFrame implements Printable {// class for hanlde adding items for gas sales and quantity

   
    JFrame frame = new JFrame();// create jframe 


    public void jbInit(int ID,double price,String time,String today,int catID) throws Exception {
        /* create table and add data to create header in the bill*/
      
        frame.setMinimumSize(new Dimension(300, 0));  //give size to frame
        // create table to add billing body details
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn(" ");
        model1.addRow(new Object[]{"Parking Area"});
        model1.addRow(new Object[]{"130, Highlevel road"});
        model1.addRow(new Object[]{"Nugegoda"});
        model1.addRow(new Object[]{"0113564567"});
        model1.addRow(new Object[]{today+" "+time});
        
        
        model1.addRow(new Object[]{""});
        model1.addRow(new Object[]{"Category: " +catID});
        model1.addRow(new Object[]{"Price per hour: " + price});

        JTable table1 = new JTable(model1);
        table1.setTableHeader(null);
        table1.setBackground(Color.WHITE);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        table1.getColumn(" ").setCellRenderer(centerRenderer);
        table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table1.getColumnModel().getColumn(0).setPreferredWidth(300);

        frame.setMinimumSize(new Dimension(300, 0));  //give size to frame
        // create table to add billing body details
        DefaultTableModel model = new DefaultTableModel();

        JPanel panel = new JPanel();
        panel.add(table1);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);



        PrinterJob job = PrinterJob.getPrinterJob();// make object for call printer job
        job.setPrintable(this);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
                /* The job did not successfully complete */
            }
        }

    }

    public int print(Graphics g, PageFormat pf, int page) throws
            PrinterException {

        if (page > 0) { /* We have only one page, and 'page' is zero-based */

            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        /* Now print the window and its visible contents */
        frame.paint(g2d);
        frame.repaint();
        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }

    public int Bill(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void jbout(int ID, double price, String time, String outtime, String today, int catID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

