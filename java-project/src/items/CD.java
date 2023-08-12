package items;

import java.time.LocalDate;

public class CD {
   //Class' attributes ======================================================================================
    private String title;
    private String gender;
    private String category;
    private float duration;
    private String manufacturer;
    private LocalDate releasedOn;
    private String artist;


    //Class' constructor =====================================================================================
    public CD (
    String title,
    String gender,
    String category,
    float duration,
    String manufacturer,
    LocalDate releasedOn,
    String artist){
        this.title = title;
        this.gender = gender;
        this.category = category;
        this.duration = duration;
        this.manufacturer = manufacturer;
        this.releasedOn = releasedOn;
        this.artist = artist;
    }


    //Getters and Setters ====================================================================================
    public void set_title (String title){
        this.title = title;
    }

    public void set_gender(String gender){
        this.gender = gender;
    }

    public void set_category (String category){
        this.category = category;
    }

    public void set_duration (float duration){
        this.duration = duration;
    }

    public void set_manufacturer (String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void set_releasedOn (LocalDate releasedOn){
        this.releasedOn = releasedOn;
    }

    public void set_artist (String artist){
        this.artist = artist;
    }

     public String get_title (){
        return title;
    }

    public String get_gender(){
        return gender;
    }

    public String get_category (){
        return category;
    }

    public float get_duration (){
        return duration;
    }

    public String get_manufacturer (){
        return manufacturer;
    }

    public LocalDate get_releasedOn (){
        return releasedOn;
    }

    public String get_artist (){
        return artist;
    }   
    //Methods=================================================================================================

    
}
