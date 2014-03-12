package db.entity;
// Generated Mar 12, 2014 5:01:43 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tour generated by hbm2java
 */
public class Tour  implements java.io.Serializable {


     private int tourCode;
     private Route route;
     private Driver driver;
     private Coach coach;
     private Date startDate;
     private String executed;
     private Set bills = new HashSet(0);
     private Set passengers = new HashSet(0);

    public Tour() {
    }

	
    public Tour(int tourCode, Driver driver) {
        this.tourCode = tourCode;
        this.driver = driver;
    }
    public Tour(int tourCode, Route route, Driver driver, Coach coach, Date startDate, String executed, Set bills, Set passengers) {
       this.tourCode = tourCode;
       this.route = route;
       this.driver = driver;
       this.coach = coach;
       this.startDate = startDate;
       this.executed = executed;
       this.bills = bills;
       this.passengers = passengers;
    }
   
    public int getTourCode() {
        return this.tourCode;
    }
    
    public void setTourCode(int tourCode) {
        this.tourCode = tourCode;
    }
    public Route getRoute() {
        return this.route;
    }
    
    public void setRoute(Route route) {
        this.route = route;
    }
    public Driver getDriver() {
        return this.driver;
    }
    
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Coach getCoach() {
        return this.coach;
    }
    
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getExecuted() {
        return this.executed;
    }
    
    public void setExecuted(String executed) {
        this.executed = executed;
    }
    public Set getBills() {
        return this.bills;
    }
    
    public void setBills(Set bills) {
        this.bills = bills;
    }
    public Set getPassengers() {
        return this.passengers;
    }
    
    public void setPassengers(Set passengers) {
        this.passengers = passengers;
    }




}


