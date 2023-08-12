package action;
import java.time.LocalDate;
import java.time.LocalDateTime;

import items.Item;
public class Borrow {

    //Class' attributes ======================================================================================
    private String idBorrow;
    private Item item[];
    private LocalDate borrowedOn;
    private LocalDate expectedGiveBackDate;
    private LocalDate giveItBackOn;


    //Class' constructor =====================================================================================
    public Borrow(String subscriptionType, Item item[], LocalDate borrowedOn){
        this.idBorrow = generateId();
        this.item = checkItems(subscriptionType, item);
        this.borrowedOn = borrowedOn;
        this.expectedGiveBackDate = checkExpectedGiveBackDate(subscriptionType, borrowedOn);
        System.out.println("All is set!");

    }


    //Getters and Setters ====================================================================================
    public void set_giveItBackOn(LocalDate giveItBackOn){
        this.giveItBackOn = giveItBackOn;
    }

    public String get_idBorrow(){
        return idBorrow;
    }

    public Item[] get_item(){
        return item;
    }

    public LocalDate get_borrowedOn(){
        return borrowedOn;
    }
    
    public LocalDate get_expectedGiveBackDate(){
        return expectedGiveBackDate;
    }
    
    public LocalDate get_giveItBackOn(){
        return giveItBackOn;
    }
    


    //Methods=================================================================================================

    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }

    //Verifies the subscription type in order to check if one can borrow a certain number of items
    private Item[] checkItems(String subscriptionType, Item item[]){
        final Item itemList[];
        final int len = item.length;

        if(subscriptionType == "Standard"){
            if (len < 3){
                //for (int i = 0; i< len; i++){
                //    itemList[i] = item[i];
                //}
                
            }

        }
        if(subscriptionType == "Plus"){

        }
        if(subscriptionType == "Premium"){
            
        }
        itemList = item;
        return itemList;
    }
    //Verifies the subscription type in order to check the deadline to give the item back to the library
    private LocalDate checkExpectedGiveBackDate(String subscriptionType, LocalDate borrowedOn){

        if(subscriptionType == "Plus"){
            return borrowedOn.plusDays(20);

        }
        if(subscriptionType == "Premium"){
            return borrowedOn.plusDays(30);
            
        }
        //Anything different than that is "Standard"
        return borrowedOn.plusDays(14);

    }

}



    
