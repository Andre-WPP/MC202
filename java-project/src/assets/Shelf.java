package assets;

import java.time.LocalDate;

import assets.items.Item;

public class Shelf extends Asset{
   //Class' attributes ======================================================================================
    private Item item[]; //Association
    private char startingLetter;
    private char endingLetter;
    private int maxCapacity;

    //Class' constructor =====================================================================================
    public Shelf(        
        LocalDate acquisitionDate,
        String supplier,
        LocalDate lastRevision,
        Item item[], 
        char startingLetter, 
        char endingLetter, 
        int maxCapacity){

        super(acquisitionDate, supplier, lastRevision);
        this.item = item;
        this.startingLetter = startingLetter;
        this.endingLetter = endingLetter;
        this.maxCapacity = maxCapacity;

    }


    //Getters and Setters ====================================================================================
    public void set_item(Item item[]){
        this.item = item;

    }

    public void set_startingLetter(char startingLetter){
        this.startingLetter = startingLetter;

    }

    public void set_endingLetter(char endingLetter){
        this.endingLetter = endingLetter;
    }

    public void set_maxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;

    }

    public Item[] get_item(){
        return item;

    }

    public char get_startingLetter(){
        return startingLetter;

    }

    public char get_endingLetter(){
        return endingLetter;
    }

    public int get_maxCapacity(){
        return maxCapacity;

    }



    //Methods=================================================================================================

    
}
