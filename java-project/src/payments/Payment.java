package payments;

import java.time.LocalDateTime;

public class Payment {

   //Class' attributes ======================================================================================
    private String idPayment;


    //Class' constructor =====================================================================================
    public Payment(){
        this.idPayment = generateId();

    }


    //Getters and Setters ====================================================================================
    public String get_idPayment(){
        return idPayment;
    }


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }


    
}
