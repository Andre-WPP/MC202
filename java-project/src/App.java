import java.time.LocalDateTime;
import java.time.LocalDate;
import persons.Patron;
import action.Subscription;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate time_now = LocalDate.now();
        Patron Ana = new Patron(        
            "CPF", 
            "463.781.195-5", 
            "(11) 99856-5215", 
            "algo@algo.com", 
            "abc123", 
            "Ana", 
            "Samuel", 
            'F', 
            "Studant", 
            0,
            null, 
            0,
            null, 
            time_now, 
            false, 
            null, 
            null
        );
        
        Subscription sp = new Subscription(
            "Plus",
            time_now
        );


        Ana.set_subscription(sp);

        System.out.println(Ana.get_subscription().get_fee());

    }








}
