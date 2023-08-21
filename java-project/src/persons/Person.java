package persons;

import java.time.LocalDateTime;
import util.*;

public class Person {
   //Class' attributes ======================================================================================
    private String idPerson;
    private Document document;
    private String cel;
    private Account account;
    private String name;
    private String lastName;
    private char gender;
    private String occupation;


    //Class' constructor =====================================================================================
    public Person(Document document, String cel,Account account, String name, String lastName, char gender, String occupation){
        this.idPerson = generateId();
        this.document = document;
        this.cel = cel;
        this.account = account;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.occupation = occupation;


    }


    //Getters and Setters ====================================================================================
    public void set_cel(String cel){
        this.cel = cel;
    }

    public void set_document(Document document){
        this.document = document;
    }

    public void set_lastName(String lastName){
        this.lastName = lastName;
    }

    public void set_occupation(String occupation){
        this.occupation = occupation;
    }

    public void set_account(Account account){
        this.account = account;
    }

    public String get_idPerson(){
        return idPerson;
    }

    public Document get_document(){
        return document;
    }

    public String get_cel(){
        return cel;
    }
    public Account get_account(){
        return account;
    }
    public String get_name(){
        return name;
    }
    public String get_lastName(){
        return lastName;
    }
    public char get_gender(){
        return gender;
    }
    public String get_occupation(){
        return occupation;
    }


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }

    
}
