package persons;

import action.Borrow;
import action.Incident;
import action.Subscription;
import util.Account;
import util.Document;

import java.time.LocalDate;

public class Patron extends Person{
   //Class' attributes ======================================================================================
   private int numberBorrow;
   private Borrow borrow[]; //Association
   private int numberIncident;
   private Incident incident[]; //Association
   private LocalDate registeredOn;
   private boolean blocked;
   private Subscription subscription; //Composition


    //Class' constructor =====================================================================================
    public Patron(
        Document document,
        String cel,
        Account account,
        String name,
        String lastName,
        char gender,
        String occupation, 
        int numberBorrow, 
        Borrow borrow[], 
        int numberIncident, 
        Incident incident[], 
        LocalDate registeredOn, 
        boolean blocked, 
        Subscription subscription){
            
        super(document, cel, account, name, lastName, gender, occupation);
        this.numberBorrow = numberBorrow;
        this.borrow = borrow;
        this.numberIncident = numberIncident;
        this.incident = incident;
        this.registeredOn =  registeredOn;
        this.blocked = blocked;
        this.subscription = subscription;
    }


    //Getters and Setters ====================================================================================
    public void set_numberBorrow(int numberBorrow){
        this.numberBorrow = numberBorrow;
    }

    public void set_borrow(Borrow borrow[]){
        this.borrow = borrow;
    }

    public void set_numberIncident(int numberIncident){
        this.numberIncident = numberIncident;
    }

    public void set_incident(Incident incident[]){
        this.incident = incident;
    }

    public void set_blocked(boolean blocked){
        this.blocked = blocked;
    }

    public void set_subscription(Subscription subscription){
        this.subscription = subscription;
    }

    public int get_numberBorrow(){
        return numberBorrow;
    }

    public Borrow [] get_borrow(){
        return borrow;
    }

    public int get_numberIncident(){
        return numberIncident;
    }

    public Incident[] get_incident(){
        return incident;
    }

    public boolean get_blocked(){
        return blocked;
    }

    public Subscription get_subscription(){
        return subscription;
    }

    public LocalDate get_registeredOn(){
        return registeredOn;
    }


    //Methods=================================================================================================
}
