package biblioteca.models.Items;

import java.util.Date;

import biblioteca.models.Members.Member;

public class PhisicalBook extends MultimediaItem{

    //Other attributes
    private String isbn;
    private String edition;
    private Copy[] items;


    //Constructor
    public PhisicalBook(
        String idMI,
        String title,
        String author,
        String publisher,
        Date publishingDate,
        String synopsis,
        //Image cover,
        String state,
        Member[] queue,
        String isbn,
        String edition,
        Copy[] items
    ){
        super(idMI, title, author, publisher, publishingDate, synopsis, state, queue);
        this.isbn = isbn;
        this.edition = edition;
        this.items = items;

        

    }

    //Getters and Setters
    



    //Methods


    
}
