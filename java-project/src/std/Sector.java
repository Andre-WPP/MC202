package std;

import java.time.LocalDateTime;
import assets.*;

public class Sector{
   //Class' attributes ======================================================================================
    private String id;
    private String floor;
    private String fieldKnowledge;
    private Shelf shelf[];
    private Table table[];
    private Computer computer[];



    //Class' constructor =====================================================================================
    public Sector(String floor, String fieldKnowledge, Shelf shelf[], Table table[], Computer computer[]){
        this.id = generateId();
        this.floor = floor;
        this.fieldKnowledge = fieldKnowledge;
        this.shelf = shelf;
        this.table = table;
        this.computer = computer;

    }


    //Getters and Setters ====================================================================================
    public void set_floor(String floor){
        this.floor = floor;
    }

    public void set_fieldKnowledge(String fieldKnowledge){
        this.fieldKnowledge = fieldKnowledge;
    }

    public void set_shelf(Shelf shelf[]){
        this.shelf = shelf;
    }

    public void set_table(Table table[]){
        this.table = table;
    }

    public void set_computer(Computer computer[]){
        this.computer = computer;
    }

    public String get_id(){
        return id;
    }

    public String get_floor(){
        return floor;
    }

    public String get_fieldKnowledge(){
        return fieldKnowledge;
    }

    public Shelf[] get_shelf(){
        return shelf;
    }

    public Table[] get_table(){
        return table;
    }

    public Computer[] get_computer(){
        return computer;
    }

    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
