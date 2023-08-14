package action;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Subscription {
   //Class' attributes ======================================================================================
    private String idSubscription;
    private String type;
    private float fee;
    private LocalDate startedOn;
    private int dueDate;


    //Class' constructor =====================================================================================
    public Subscription(String type, LocalDate startedOn){
        this.idSubscription = generateId();
        this.type = type;
        this.fee = setFee(type);
        this.startedOn = startedOn;
        this.dueDate = select_dueDate();
    }


    //Getters and Setters ====================================================================================
    public void set_type(String type){
        this.type = type;
    }

    public void set_fee(String type){
        this.fee = setFee(type);
    }

    public void set_startedOn(LocalDate startedOn){
        this.startedOn = startedOn;
    }

    public void set_dueDate(){
        this.dueDate = select_dueDate();
    }

    public String get_idSubscription(){
        return idSubscription;
    }

    public String get_type(){
        return type;
    }

    public float get_fee(){
        return fee;
    }

    public LocalDate get_startedOn(){
        return startedOn;
    }

    public int get_dueDate(){
        return dueDate;
    }


    


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }

    private float setFee(String type){

        if(type == "Plus"){
            return 15;

        }
        if(type == "Premium"){
            return 30;
            
        }
        //Anything different than that is "Standard"
        return 0;

    }

    private int select_dueDate(){
        System.out.println("Select one of the following due dates: 5, 15, 20");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int i = 0;
        sc1.close();

        while(i<5){
            if (num != 5 && num != 15 && num != 20){
                System.out.println("Invalid Number! Please select one of the following due dates: 5, 15, 20");
                num = sc1.nextInt();
                sc1.close();
                i++;
                if(i==4){
                    num = 5;
                }
  
            } else{
                break;
            }
            i++;
        }
        

        return num;

        


    }

    
}
