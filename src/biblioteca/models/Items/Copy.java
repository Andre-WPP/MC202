package biblioteca.models.Items;

import java.util.Date;
import biblioteca.models.Libraries.Shelf;
import biblioteca.models.Items.MultimediaItemInterface;
import biblioteca.models.Members.MemberInterface;

public class Copy {

    //Declaring attributes
    private MultimediaItemInterface item;
    private Shelf shelf;
    private boolean isAvailable;
    private Date returnDate;
    private MemberInterface withWho;

    //Constructor
    public Copy (
        MultimediaItemInterface item,
        Shelf shelf,
        boolean isAvailable,
        Date returnDate,
        MemberInterface withWho

    ){
        this.item = item;
        this.shelf = shelf;
        this.isAvailable = isAvailable;
        this.returnDate = returnDate;
        this.withWho = withWho;

    }

    //Getters and Setters
    public MultimediaItemInterface get_item(){
        return item;
    }

    public Shelf get_shelf(){
        return shelf;
    }

    public boolean get_isAvailable(){
        return isAvailable;
    }

    public Date get_returnDate(){
        return returnDate;
    }

    public MemberInterface get_withWho(){
        return withWho;
    }

    public void get_item(MultimediaItemInterface item){
        this.item = item;
    }

    public void get_shelf(Shelf shelf){
        this.shelf = shelf;
    }

    public void get_isAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void get_returnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    public void get_withWho(MemberInterface withWho){
        this.withWho = withWho;
    }

    //Methods
    
}
