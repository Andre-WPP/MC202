package std;

import java.time.LocalDateTime;


public class Sector{
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
