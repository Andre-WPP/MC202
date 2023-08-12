package persons;

import action.Borrow;
import action.Incident;
import action.Subscription;
import java.time.LocalDate;

public class Patron extends Person{
   //Class' attributes ======================================================================================
   private int numberBorrow;
   private Borrow borrow[];
   private int numberIncident;
   private Incident incident[];
   private LocalDate registeredOn;
   private boolean blocked;
   private Subscription subscription;
   private CreditCard card[];


    //Class' constructor =====================================================================================
    public Patron(
        String documentType, 
        String docNumber, 
        String cel, 
        String email, 
        String password, 
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
        Subscription subscription, 
        CreditCard card[]){
            
        super(documentType, docNumber, cel, email, password, name, lastName, gender, occupation);
        this.numberBorrow = numberBorrow;
        this.borrow = borrow;
        this.numberIncident = numberIncident;
        this.incident = incident;
        this.registeredOn =  registeredOn;
        this.blocked = blocked;
        this.subscription = subscription;
        this.card = card;
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

    public void set_card(CreditCard card[]){
        this.card = card;
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

    public CreditCard[] get_card(){
        return card;
    }

    public LocalDate get_registeredOn(){
        return registeredOn;
    }


    //Methods=================================================================================================
}
