package data_tier;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import presentation_tier.chargess;

public class DB_query {

    Db_connection db = new Db_connection();

    public String login(ArrayList<user> user) throws SQLException {
        for (user u : user) {
            String Query = " Select * from user where username='" + u.getUsername() + "' && password='" + u.getPassword() + "'";

            ResultSet rs = db.serach(Query);

            if (rs.next()) {
                return rs.getString(6);
            }

        }
        return null;
    }

    public boolean signup(ArrayList<user> user) throws SQLException {
        try {
            for (user u : user) {
                String Query = " insert into user values (null,'" + u.getUsername() + "','" + u.getPassword() + "','" + u.getName() + "' ,'" + u.getNIC() + "','" + u.getType() + "')";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
                    return true;
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    public int charges(ArrayList<charges> ch) throws SQLException {
        try {
            for (charges c : ch) {
                String Query = "Insert into charges values(null,  '"+c.getINtime()+"' , '00:00:00' , '"+c.getDate()+"', '"+c.getCategory()+"', '"+c.getPrice_per_hour()+"' , '"+c.getTotal()+"','no')";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
            Query = " Select * from charges";

            ResultSet rs = db.serach(Query);

            
            if (rs.next()) {
               return (rs.getInt(1));
            }
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }

    public boolean AddCategory(ArrayList<category> cat) throws SQLException {
        try {
            for (category c : cat) {
                String Query = "insert into category values ('" + c.getID() + "','" + c.getCategory() + "','" + c.getPrice_per_hour() + "')";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
                    return true;
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    public boolean DeleteCategory(ArrayList<category> category) throws SQLException {
        try {
            for (category c : category) {
                String Query = "delete from category where ID =" +c.getID()+ "";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
                    return true;
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    public boolean UpdateCategory(ArrayList<category> category) throws SQLException {
        try {
            for (category c : category) {
                String Query = "update category set price_per_hour= '" + c.getPrice_per_hour() + "' where ID =" + c.getID() + "";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
                    return true;
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    public boolean invehicle(ArrayList<charges> inv) throws SQLException {
        try {

            for (charges c : inv) {
                System.err.println(c.getCategory());
                System.err.println(c.getDate());
                System.err.println(c.getINtime());
                System.err.println(c.getPrice_per_hour());
                System.err.println(c.getTotal());

                String Query = "Insert INTO charges values(null,'" + c.getCategory() + "','" + c.getDate() +"','"+ c.getINtime() +"','"+ c.getPrice_per_hour() +"','"+ c.getTotal() +"','no')";
                int number = db.addupdatedelete(Query);
                if (number != 0) {
                    return true;
                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

//     public boolean outvehicle(ArrayList<charges> inv) throws SQLException {
//        try {
//
//            for (charges c : inv) {
//                System.err.println(c.getCategory());
//                System.err.println(c.getDate());
//                System.err.println(c.getINtime());
//                System.err.println(c.getPrice_per_hour());
//                System.err.println(c.getTotal());
//
//                String Query = "Insert INTO charges values(null,'" + c.getCategory() + "','" + c.getDate() +"','"+ c.getINtime() +"','"+ c.getPrice_per_hour() +"','"+ c.getTotal() +"','no')";
//                int number = db.addupdatedelete(Query);
//                if (number != 0) {
//                    return true;
//                }
//
//            }
//        } catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        }
//        return false;
//    }
    
    
    public ArrayList<category> searchcat(int cat) throws SQLException {
        String Query = " Select * from category where ID=" + cat + "";

        ResultSet rs = db.serach(Query);

        ArrayList<category> categry = new ArrayList<category>();
        category c = new category();
        if (rs.next()) {
            c.setCategory(rs.getString(2));
            c.setPrice_per_hour(rs.getDouble(3));
            categry.add(c);
            return categry;
        }

        return null;
    }
    
      public ArrayList<charges> searchcharges(int ID) throws SQLException {
        String Query = " Select * from charges where ID=" + ID + "";

        ResultSet rs = db.serach(Query);

        ArrayList<charges> charges = new ArrayList<charges>();
        charges c = new charges();
        if (rs.next()) {
            c.setID(rs.getInt(1));
            c.setINtime(rs.getString(2));
            c.setOuttime(rs.getString(3));
            c.setDate(rs.getString(4));
            c.setCategory(rs.getString(5));
            c.setPrice_per_hour(rs.getInt(6));
            c.setTotal(rs.getInt(7));
            c.setConfirmation(rs.getString(8));

            charges.add(c);
            return charges;
        }

        return null;
    }
      
//     public ArrayList<charges> updatetable(int ID) throws SQLException {
//        
//         String Query = "SELECT * FROM charges ORDER BY ID DESC ";
//         ArrayList<charges> charges = new ArrayList<charges>();
//        charges c = new charges();
//         ResultSet rs = db.serach(Query);
//
//          while(rs.next()){
//        String category=rs.getString("category");
//        String INtime=rs.getString("IN Time");
//        String Outtime=rs.getString("Out Time");
//        double price_per_hour=rs.getDouble("Price per hour");
//        double total=rs.getDouble("Total");
//         
//        
//      model.addRow(new Object[] {category ,INtime,Outtime,price_per_hour,total});
//
//    }
//        return null;
        }