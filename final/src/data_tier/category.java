/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_tier;

/**
 *
 * @author sanju
 */
public class category {
   String category;
    double price_per_hour;
    int ID;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice_per_hour() {
        return price_per_hour;
    }

    public void setPrice_per_hour(double price_per_hour) {
        this.price_per_hour = price_per_hour;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
