package assets;

import java.time.LocalDateTime;

public class Table {
   //Class' attributes ======================================================================================
    private int numberPlaces;
    private Chair chair[];


    //Class' constructor =====================================================================================
    public Table(int numberPlaces, Chair chair[]){
        this.numberPlaces = numberPlaces;
        this.chair = chair;

    }


    //Getters and Setters ====================================================================================
    public void set_numberPlaces(int numberPlaces){
        this.numberPlaces = numberPlaces;

    }

    public void set_chair(Chair chair[]){
        this.chair = chair;

    }

    public int set_numberPlaces(){
        return numberPlaces;

    }

    public Chair[] set_chair(){
        return chair;

    }


    //Methods=================================================================================================

    
}
