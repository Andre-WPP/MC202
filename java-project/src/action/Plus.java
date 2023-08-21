package action;

import java.time.LocalDate;
import payments.Payment;

public class Plus extends Subscription{

  //Class' attributes ======================================================================================
    private String type;
    private float fee;
    private int borrowMonth; //How many items can be borrowed per month
    private int giveBackWeek; //Time in weeks to give it back
    private boolean reservation; //If it is able to book a table from the app


    //Class' constructor =====================================================================================
    public Plus(LocalDate startedOn, Payment[] payment){
        super(startedOn, payment);
        this.type = "Plus";
        this.fee = 15;
        this.borrowMonth = 5;
        this.giveBackWeek = 3;
        this.reservation = true;


    }


    //Getters and Setters ====================================================================================
    public String get_type(){
        return type;
    }

    public float get_fee(){
        return fee;
    }

    public int get_borrowMonth(){
        return borrowMonth;
    }

    public int get_giveBackWeek(){
        return giveBackWeek;
    }

    public boolean get_reservation(){
        return reservation;
    }

    


    //Methods=================================================================================================

    
}
