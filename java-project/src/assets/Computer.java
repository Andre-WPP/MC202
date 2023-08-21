package assets;

import java.time.LocalDate;

public class Computer extends Asset{
   //Class' attributes ======================================================================================
    private String brand;


    //Class' constructor =====================================================================================
    public Computer(        
        LocalDate acquisitionDate,
        String supplier,
        LocalDate lastRevision,
        String brand){

        super(acquisitionDate, supplier, lastRevision);
        this.brand = brand;

    }


    //Getters and Setters ====================================================================================
    public void set_brand (String brand){
        this.brand = brand;

    }

    public String get_brand(){
        return brand;

    }


    //Methods=================================================================================================

    
}
