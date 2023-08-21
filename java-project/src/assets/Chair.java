package assets;

import java.time.LocalDate;

public class Chair extends Asset{
   //Class' attributes ======================================================================================
    private float maxWeight;
    
    //Class' constructor =====================================================================================
    public Chair(
        LocalDate acquisitionDate,
        String supplier,
        LocalDate lastRevision,
        float maxWeight){
            
        super(acquisitionDate, supplier, lastRevision);
        this.maxWeight = maxWeight;
    }


    //Getters and Setters ====================================================================================
    public void set_maxWeight(float maxWeight){
        this.maxWeight = maxWeight;
    }

    public float get_maxWeight(){
        return maxWeight;
    }



    //Methods=================================================================================================

}
