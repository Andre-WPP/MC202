package biblioteca.models.Items;

import java.util.Date;
import biblioteca.models.Members.Member;


public abstract class MultimediaItem implements MultimediaItemInterface{


    //Declaring attributes
    private String idMI;
    private String title;
    private String author;
    private String publisher;
    private Date publishingDate;
    private String synopsis;
    //private Image cover;
    private static int totalQty;
    private String state; //Item's condition
    private Member[] queue;

    //Constructor
    public MultimediaItem(
        String idMI,
        String title,
        String author,
        String publisher,
        Date publishingDate,
        String synopsis,
        //Image cover,
        String state,
        Member[] queue
    ){
        this.idMI = idMI;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingDate = publishingDate;
        this.synopsis = synopsis;
        //this.cover = cover;
        this.state = state;
        this.queue = queue;


    }

    //Declaring methods
    public boolean addCopy(Copy copy){
        System.out.println("copy added!");
        return false;


    }

    public boolean bookQueue(Member member){
        System.out.println("member added!");
        return false;

    }

    //Inherited abstract methods
    public String getTitulo(){
        return "0";
    }
    public String getDetalhes(){
        return "0";
    }


    
}
