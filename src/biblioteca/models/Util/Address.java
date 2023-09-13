package biblioteca.models.Util;

public class Address {

    //Defining attributes
    private String street;
    private String number;
    private String complement;
    private String city;
    private String state;
    private String country;
    private String postalCode;


    //Constructor
    public Address(
        String street,
        String number,
        String complement,
        String city,
        String state,
        String country,
        String postalCode
    ){
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;

    }

    //Getters and Setters

    //Methods
    
}
