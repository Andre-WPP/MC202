package assets;

public class Chair {
   //Class' attributes ======================================================================================
    private float maxWeight;
    
    //Class' constructor =====================================================================================
    public Chair(float maxWeight){
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
