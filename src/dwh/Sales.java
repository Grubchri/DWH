/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwh;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


public class Sales {
    LocalDateTime Date;
    LocalDate RSD;
    LocalDate RED;
    long CustomerID;
    char ChannelID;
    int ProductID;
    int DealerID;
    long RecipientID;
    int Pieces;
    String Explorer;
    boolean Returned;
    LocalTime Duration;
    int Clicks;
    int Discount;

    public Sales(LocalDateTime Date, long CustomerID, char ChannelID, int ProductID, int DealerID, long RecipientID, int Pieces, String Explorer, boolean Returned, LocalTime Duration, int Clicks, int Discount) {
        this.Date = Date;
        this.CustomerID = CustomerID;
        this.ChannelID = ChannelID;
        this.ProductID = ProductID;
        this.DealerID = DealerID;
        this.RecipientID = RecipientID;
        this.Pieces = Pieces;
        this.Explorer = Explorer;
        this.Returned = Returned;
        this.Duration = Duration;
        this.Clicks = Clicks;
        this.Discount = Discount;
    }

    Sales() {
        
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime Date) {
        this.Date = Date;
    }

    public long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(long CustomerID) {
        this.CustomerID = CustomerID;
    }

    public char getChannelID() {
        return ChannelID;
    }

    public void setChannelID(char ChannelID) {
        this.ChannelID = ChannelID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getDealerID() {
        return DealerID;
    }

    public void setDealerID(int DealerID) {
        this.DealerID = DealerID;
    }

    public long getRecipientID() {
        return RecipientID;
    }

    public void setRecipientID(long RecipientID) {
        this.RecipientID = RecipientID;
    }

    public int getPieces() {
        return Pieces;
    }

    public void setPieces(int Pieces) {
        this.Pieces = Pieces;
    }

    public String getExplorer() {
        return Explorer;
    }

    public void setExplorer(String Explorer) {
        this.Explorer = Explorer;
    }

    public boolean isReturned() {
        return Returned;
    }

    public void setReturned(boolean Returned) {
        this.Returned = Returned;
    }

    public LocalTime getDuration() {
        return Duration;
    }

    public void setDuration(LocalTime Duration) {
        this.Duration = Duration;
    }

    public int getClicks() {
        return Clicks;
    }

    public void setClicks(int Clicks) {
        this.Clicks = Clicks;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        String CustID="";
        CustID=String.valueOf(CustomerID);
        if(String.valueOf(CustomerID).length()<9){
           int size=9-String.valueOf(CustomerID).length();
           while(size>0){
               CustID="0"+CustID;
               size--;
           }
        }
        
        String time=""+Date.toLocalTime();
        String dur=""+Duration;
        
       if(Date.toLocalTime().getSecond()==0){
           time=time+":00";
       }
       if(Duration.getSecond()==0){
           dur=dur+":00";
       }
        
       if(Explorer.contains("Internet")){
           return CustID +"|" + RSD.toString() +"|" + RED.toString() +"|" + Date.toLocalDate() +"|"+time+"|" + ChannelID + "|" + ProductID + "|" + DealerID  +  "|" + this.RecipientID +"|" + Explorer + "|" + Returned + "|" + dur + "|" + Clicks +"|" + Pieces + "|" + Discount;
       }else if(Explorer.contains("Net")){
           return CustID +"|" + RSD.toString() +"|" + RED.toString() +"|" + Date.toLocalDate() +"|"+time+"|" + ChannelID + "|" + ProductID + "|" + DealerID +  "|" + this.RecipientID +"|" + Explorer + "|" + Returned + "|" + dur + "|" + Clicks +"|" + Pieces + "|" + Discount;
       }
       
        return CustID +"|" + RSD.toString() +"|" + RED.toString() +"|" + Date.toLocalDate() +"|"+time+"|" + ChannelID + "|" + ProductID + "|" + DealerID  +  "|" + this.RecipientID +"|" + Explorer + "|" + Returned + "|" + dur + "|" + Clicks +"|" + Pieces + "|" + Discount;
    }
    
    
    
}
