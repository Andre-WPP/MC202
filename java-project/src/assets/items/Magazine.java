package assets.items;

import java.time.LocalDate;

public class Magazine extends Item{
    private String title;
    private LocalDate publishedOn;
    private String edition;
    private String language;
    private String mainDomain;
    private String gender;
    private String name;


    //Class' constructor =====================================================================================
    public Magazine(
        LocalDate acquisitionDate, 
        String supplier, 
        LocalDate lastRevision, 
        int qty,
        String title,
        LocalDate publishedOn,
        String edition,
        String language,
        String mainDomain,
        String gender,
        String name){
        super(acquisitionDate, supplier, lastRevision, qty);
        this.title = title;
        this.publishedOn = publishedOn;
        this.edition = edition;
        this.language = language;
        this.mainDomain = mainDomain;
        this.gender = gender;
        this.name = name;

    }


    //Getters and Setters ====================================================================================
    public void set_title(String title){
        this.title = title;

    }

    public void set_publishedOn(LocalDate publishedOn){
        this.publishedOn = publishedOn;

    }

    public void set_edition(String edition){
        this.edition = edition;

    }

    public void set_language(String language){
        this.language = language;

    }

    public void set_mainDomain(String mainDomain){
        this.mainDomain = mainDomain;

    }

    public void set_gender(String gender){
        this.gender = gender;

    }

    public void set_name(String name){
        this.name = name;

    }

    public String get_title(){
        return title;

    }

    public LocalDate get_publishedOn(){
        return publishedOn;

    }

    public String get_edition(){
        return edition;

    }

    public String get_language(){
        return language;

    }

    public String get_mainDomain(){
        return mainDomain;

    }

    public String get_gender(){
        return gender;

    }

    public String get_name(){
        return name;

    }


    //Methods=================================================================================================

    
}
