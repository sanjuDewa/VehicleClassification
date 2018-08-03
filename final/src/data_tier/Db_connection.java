/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_tier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanju
 */
public class Db_connection {
     Connection con;
    Statement st;
    String query;
    String type;

    public Db_connection() {

        try {
            String url = "jdbc:mysql://localhost/vehicle";
            String user = "root";
            String pass = "";
            String query = "";

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {

            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
     public ResultSet serach(String Query){
        try {
            return st.executeQuery(Query);
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
     return null;
  }
     public int addupdatedelete(String Query){
        try {
            return st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
     return 0;
  }
    
}
