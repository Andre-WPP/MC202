package assets.items;

import java.time.LocalDate;

import assets.Asset;

public class Item extends Asset{
   //Class' attributes ======================================================================================
    private int qty;

    //Class' constructor =====================================================================================
    public Item(
        LocalDate acquisitionDate, 
        String supplier, 
        LocalDate lastRevision, 
        int qty){
        super(acquisitionDate, supplier, lastRevision);
        this.qty = qty;

    }

    //Getters and Setters ====================================================================================
    public void set_qty(int qty){
        this.qty = qty;

    }

    public int get_qty(){
       return qty;

    }


    //Methods=================================================================================================

    
}
