package db.entity;
// Generated Mar 12, 2014 5:01:43 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Bill generated by hbm2java
 */
public class Bill  implements java.io.Serializable {


     private int refNo;
     private Town town;
     private Tour tour;
     private Hotel hotel;
     private Date billDate;
     private int numberOfIndividuals;
     private Double amount;

    public Bill() {
    }

	
    public Bill(int refNo, int numberOfIndividuals) {
        this.refNo = refNo;
        this.numberOfIndividuals = numberOfIndividuals;
    }
    public Bill(int refNo, Town town, Tour tour, Hotel hotel, Date billDate, int numberOfIndividuals, Double amount) {
       this.refNo = refNo;
       this.town = town;
       this.tour = tour;
       this.hotel = hotel;
       this.billDate = billDate;
       this.numberOfIndividuals = numberOfIndividuals;
       this.amount = amount;
    }
   
    public int getRefNo() {
        return this.refNo;
    }
    
    public void setRefNo(int refNo) {
        this.refNo = refNo;
    }
    public Town getTown() {
        return this.town;
    }
    
    public void setTown(Town town) {
        this.town = town;
    }
    public Tour getTour() {
        return this.tour;
    }
    
    public void setTour(Tour tour) {
        this.tour = tour;
    }
    public Hotel getHotel() {
        return this.hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public Date getBillDate() {
        return this.billDate;
    }
    
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
    public int getNumberOfIndividuals() {
        return this.numberOfIndividuals;
    }
    
    public void setNumberOfIndividuals(int numberOfIndividuals) {
        this.numberOfIndividuals = numberOfIndividuals;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }




}


