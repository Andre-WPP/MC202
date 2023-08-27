
import java.time.LocalDate;
import persons.Patron;
import std.Library;
import std.Sector;
import action.Standard;
import action.Borrow;
import action.Incident;
import assets.Shelf;
import assets.items.Book;
import assets.items.Item;
import util.*;
import payments.*;

public class App {
    public static void main(String[] args) throws Exception {



        //Test is create a new library, a new sector, new asset, new shelf, new item, new book, new member (patron) and a borrow relation between them 

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
        'F',
        "Estudante", 
        0, 
        br, 
        0, 
        in, 
        time_now,
        false, 
        sb);

        System.out.println(Ana.get_document());


        //Create a new library, sector and asset
        Book bk1 = new Book(
            time_now,
            "Entrega livro ltda",
            time_now, 
            2,
            "Algo",
            "Diferente",
            time_now, 
            "São Paulo",
            "Publicadora",
            "1 edição",
            "José",
            "Rafaela",
            "-",
            "Português",
            "Matemática",
            "Ciências exatas",
            300,
            "Capa dura"
        );

        Book bk_set[] = new Book[1];
        bk_set[0] = bk1;

        Shelf s1 = new Shelf(
            time_now,
            "Faz estante ME",
            time_now,
            bk_set,
            'A',
            'C',
            20

        );

        Shelf s_set[] = new Shelf[1];
        s_set[0] = s1;

        Sector sc1 = new Sector(
            "1st floor",
            "Mathematics",
            s_set,
            null,
            null
        );

        Sector sc_set[] = new Sector[1];
        sc_set[0] = sc1;
        
        Library lib_1 = new Library(
            "Biblioteca Universitária Multimídia",
            "106021012154", 
            "Rua X", 
            50, 
            5,
            1, 
            sc_set, 
            null
        );


        System.out.println(Ana.get_subscription().get_type());

        Item it[] = new Item[1];
        it[0] = bk1;
        Borrow b1 = new Borrow(
            Ana.get_subscription().get_type(), 
            it, 
            time_now);


        System.out.println(b1.get_idBorrow());
    }

    








}
