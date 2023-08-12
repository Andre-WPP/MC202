package persons;

import java.time.LocalDateTime;

public class Person {
   //Class' attributes ======================================================================================
    private String idPerson;
    private String documentType;
    private String docNumber;
    private String cel;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private char gender;
    private String occupation;


    //Class' constructor =====================================================================================
    public Person(String documentType, String docNumber, String cel, String email, String password, String name, String lastName, char gender, String occupation){
        this.idPerson = generateId();
        this.documentType = documentType;
        this.docNumber = docNumber;
        this.cel = cel;
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.occupation = occupation;


    }


    //Getters and Setters ====================================================================================
    public void set_cel(String cel){
        this.cel = cel;
    }

    public void set_email(String email){
        this.email = email;
    }

    public void set_lastName(String lastName){
        this.lastName = lastName;
    }

    public void set_occupation(String occupation){
        this.occupation = occupation;
    }

    public String get_idPerson(){
        return idPerson;
    }

    public String get_documentType(){
        return documentType;
    }
    public String get_docNumber(){
        return docNumber;
    }
    public String get_cel(){
        return cel;
    }
    public String get_email(){
        return email;
    }
    public String get_password(){
        return password;
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
