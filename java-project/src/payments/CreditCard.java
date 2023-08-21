package payments;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class CreditCard extends Payment{
   //Class' attributes ======================================================================================
    private String idCard;
    private String cardName;
    private String cardNumber;
    private String securityNumber;
    private String printedName;
    private LocalDate expirationDate;

    //Class' constructor =====================================================================================
    public CreditCard (String cardName, String cardNumber, String securityNumber, String printedName, LocalDate expirationDate){
        super();
        this.idCard = generateId();
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
        this.printedName = printedName;
        this.expirationDate = expirationDate;
    }


    //Getters and Setters ====================================================================================
    public void set_cardName(String cardName){
        this.cardName = cardName;

    }

    public void set_cardNumber(String cardNumber){
        this.cardNumber = cardNumber;

    }

    public void set_securityNumber(String securityNumber){
        this.securityNumber = securityNumber;

    }

    public void set_printedName(String printedName){
        this.printedName = printedName;

    }

    public void set_expirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;

    }

    public String get_idCard(){
        return idCard;

    }

    public String get_cardName(){
        return cardName;

    }

    public String get_cardNumber(){
        return cardNumber;

    }

    public String get_securityNumber(){
        return securityNumber;

    }

    public String get_printedName(){
        return printedName;

    }

    public LocalDate get_expirationDate(){
        return expirationDate;

    }


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
