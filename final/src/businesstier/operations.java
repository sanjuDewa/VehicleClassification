/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesstier;

import classification.Class1;
import com.mathworks.toolbox.javabuilder.MWException;
import data_tier.DB_query;
import data_tier.DB_query;
import data_tier.category;
import data_tier.category;
import data_tier.charges;
import data_tier.charges;
import data_tier.user;
import data_tier.user;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sanju
 */
public class operations {

    public String login(ArrayList<user> user) throws SQLException {
        DB_query db = new DB_query();
        return db.login(user);

    }

    public boolean signup(ArrayList<user> user) throws SQLException {
        DB_query db = new DB_query();
        return db.signup(user);

    }

    public boolean AddCategory(ArrayList<category> cat) throws SQLException {
        DB_query db = new DB_query();
        return db.AddCategory(cat);

    }

    public boolean Deletecategory(ArrayList<category> cat) throws SQLException {
        DB_query db = new DB_query();
        return db.DeleteCategory(cat);
    }

    public boolean Updatecategory(ArrayList<category> cat) throws SQLException {
        DB_query db = new DB_query();
        return db.UpdateCategory(cat);
    }

    public int Addcharges(ArrayList<charges> charge) throws SQLException {
        DB_query db = new DB_query();
        return db.charges(charge);
    }
    
    public ArrayList<category> Searchcategory(int cat) throws SQLException {
        DB_query db = new DB_query();
        return db.searchcat(cat);
    }
    
    public int Vehicleclassify(String url) throws SQLException, MWException {
        int ID=0;
        Object[] id;
        classification.Class1 c=new Class1();
        id=c.classification(1, url);
        for(Object o:id){
          ID=Integer.parseInt(o.toString());
        }
        return ID;
                
                }
    public ArrayList<charges> searchcharges(int charge) throws SQLException {
        DB_query db = new DB_query();
        return db.searchcharges(charge);
    }
    
}
