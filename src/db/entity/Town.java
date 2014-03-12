package db.entity;
// Generated Mar 12, 2014 5:01:43 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Town generated by hbm2java
 */
public class Town  implements java.io.Serializable {


     private int id;
     private String name;
     private Boolean overNightStop;
     private Set bills = new HashSet(0);
     private Set routeTowns = new HashSet(0);
     private Set hotels = new HashSet(0);

    public Town() {
    }

	
    public Town(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Town(int id, String name, Boolean overNightStop, Set bills, Set routeTowns, Set hotels) {
       this.id = id;
       this.name = name;
       this.overNightStop = overNightStop;
       this.bills = bills;
       this.routeTowns = routeTowns;
       this.hotels = hotels;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getOverNightStop() {
        return this.overNightStop;
    }
    
    public void setOverNightStop(Boolean overNightStop) {
        this.overNightStop = overNightStop;
    }
    public Set getBills() {
        return this.bills;
    }
    
    public void setBills(Set bills) {
        this.bills = bills;
    }
    public Set getRouteTowns() {
        return this.routeTowns;
    }
    
    public void setRouteTowns(Set routeTowns) {
        this.routeTowns = routeTowns;
    }
    public Set getHotels() {
        return this.hotels;
    }
    
    public void setHotels(Set hotels) {
        this.hotels = hotels;
    }




}


