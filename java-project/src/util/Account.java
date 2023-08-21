package util;

import java.time.LocalDateTime;

public class Account {
  //Class' attributes ======================================================================================
    private String idAccount;
    private String email;
    private String password;



    //Class' constructor =====================================================================================
    public Account(String email, String password){
        this.idAccount = generateId();
        this.email = email;
        this.password = password;

    }


    //Getters and Setters ====================================================================================
    public void set_email(String email){
        this.email = email;
    }

    public void set_password(String password){
        this.password = password;
    }

    public String get_idAccount(){
        return idAccount;
    }

    public String get_email(){
        return email;
    }

    public String get_password(){
        return password;
    }
    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}

