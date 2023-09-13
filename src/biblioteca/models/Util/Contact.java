package biblioteca.models.Util;

public class Contact {

    //Declaring attributes
    private String email;
    private String phone1;
    private String phone2;

    //Constructor
    public Contact(
        String email,
        String phone1,
        String phone2

    ){
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;

    }

    //Getters and Setters
    public String get_email(){
        return email;
    }

    public String get_phone1(){
        return phone1;
    }

    public String get_phone2(){
        return phone2;
    }

    public void get_email(String email){
        this.email = email;
    }

    public void get_phone1(String phone1){
        this.phone1 = phone1;
    }

    public void get_phone2(String phone2){
        this.phone2 = phone2;
    }

    //Methods
}
