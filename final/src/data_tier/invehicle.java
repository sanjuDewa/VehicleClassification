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
public class invehicle {
    
    int ID;
    int recieptNO;
    int INtime;
    int Outtime;
    int Date;
    String category;
    double price_per_hour;
    double total;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRecieptNO() {
        return recieptNO;
    }

    public void setRecieptNO(int recieptNO) {
        this.recieptNO = recieptNO;
    }

    public int getINtime() {
        return INtime;
    }

    public void setINtime(int INtime) {
        this.INtime = INtime;
    }

    public int getOuttime() {
        return Outtime;
    }

    public void setOuttime(int Outtime) {
        this.Outtime = Outtime;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
