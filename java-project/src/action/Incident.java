package action;

import java.time.LocalDateTime;

public class Incident {
   //Class' attributes ======================================================================================
    private String idIncident;
    private String type;


    //Class' constructor =====================================================================================
    public Incident(String type){
        this.idIncident = generateId();
        this.type = type;
    }


    //Getters and Setters ====================================================================================
    public String get_idIncident(){
        return idIncident;
    }

    public String get_type(){
        return type;
    }
    


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }

  
}
