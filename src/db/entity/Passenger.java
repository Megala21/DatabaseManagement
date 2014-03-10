package db.entity;
// Generated Mar 10, 2014 2:54:58 PM by Hibernate Tools 3.6.0



/**
 * Passenger generated by hbm2java
 */
public class Passenger  implements java.io.Serializable {


     private int id;
     private Tour tour;
     private String name;

    public Passenger() {
    }

	
    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Passenger(int id, Tour tour, String name) {
       this.id = id;
       this.tour = tour;
       this.name = name;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Tour getTour() {
        return this.tour;
    }
    
    public void setTour(Tour tour) {
        this.tour = tour;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


