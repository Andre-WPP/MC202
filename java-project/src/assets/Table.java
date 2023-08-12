package assets;

import java.time.LocalDateTime;

public class Table {
   //Class' attributes ======================================================================================



    //Class' constructor =====================================================================================



    //Getters and Setters ====================================================================================
    


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
