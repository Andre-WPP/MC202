package biblioteca.models.Libraries;

import biblioteca.models.Libraries.Library;
import biblioteca.models.Items.Copy;

public class Shelf {

    //Declaring attributes
    private Copy[] items;
    private char startingLetter;
    private char endingLetter;
    private int maxCapacity;
    private Library library;

    //Constructor
    public Shelf(
        Copy[] items,
        char startingLetter,
        char endingLetter,
        int maxCapacity,
        Library library

    ){
        this.items = items;
        this.startingLetter = startingLetter;
        this.endingLetter = endingLetter;
        this.maxCapacity = maxCapacity;
        this.library = library;
    }

    //Getters and Setters

    //Methods

    
}
