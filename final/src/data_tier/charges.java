
 
package data_tier;

public class charges {

    static void add(charges c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  int ID;
    int recieptNO;
    String INtime;
    String Outtime;
    String Date;
    String category;
    double price_per_hour;
    double total;
    String confirmation;

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

    public String getINtime() {
        return INtime;
    }

    public void setINtime(String INtime) {
        this.INtime = INtime;
    }

    public String getOuttime() {
        return Outtime;
    }

    public void setOuttime(String Outtime) {
        this.Outtime = Outtime;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
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

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

   
}
