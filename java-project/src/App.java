import java.time.LocalDateTime;
import java.time.LocalDate;
import persons.Patron;
import action.Standard;
import action.Borrow;
import action.Incident;
import util.*;
import payments.*;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate time_now = LocalDate.now();
        Document doc = new Document(
            "RG",
            "395461587"
        );

        Account acc = new Account(
            "algo@algo.com",
            "123456"

        );

        Borrow[] br = null;
        Incident[] in = null;
        Payment[] p = null;

        Standard sb = new Standard(
            time_now,
            p
        );

        Patron Ana = new Patron(        
        doc,
        "(19)98545-6658",
        acc,
        "Ana",
        "Pessoa",
        "F",
        "Estudante", 
        0, 
        br, 
        0, 
        in, 
        time_now, 
        false, 
        sb);

        System.out.println(Ana.get_document());

    }








}
