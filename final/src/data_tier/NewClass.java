
package data_tier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewClass {
    Connection con;
    Statement st;
    String query;
    String type;
    
    int ID;
    int recieptNO;
    String INtime;
    String Outtime;
    String Date;
    String category;
    double price_per_hour;
    double total;
    String confirmation;
    
    public NewClass(){
         try {
            String url = "jdbc:mysql://localhost/vehicles";
            String user = "root";
            String pass = "";
            String query = "";

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {

            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) 
        {
            System.out.println("Error: " + ex.getMessage());
        }
    

      
    String query ="Insert into charges values(null,  '10:05:20' , '10:20:10' , '2017/07/27', 'bike', '50' , '70','no')";
    int n;
        try {
            n = st.executeUpdate(query);
            if(n==1){
        System.err.println("added");
    }
    else{
        System.err.println("not added"); 
    }
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
 
    }
    
    public static void main(String[] args) {
        NewClass n=new NewClass();
        
    }
    
}