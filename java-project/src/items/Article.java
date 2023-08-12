package items;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Article {
   //Class' attributes ======================================================================================
    private String title;
    private LocalDate publishedOn;
    private String author1;
    private String author2;
    private String language;
    private String mainDomain;


    //Class' constructor =====================================================================================
    public Article(
     String title,
     LocalDate publishedOn,
     String author1,
     String author2,
     String language,
     String mainDomain
 ){

        this.title = title;
        this.publishedOn = publishedOn;
        this.author1 = author1;
        this.author2 = author2;
        this.language = language;
        this.mainDomain = mainDomain;

    }


    //Getters and Setters ====================================================================================
    public void set_title(String title){
        this.title = title;

    }

    public void set_publishedOn(LocalDate publishedOn){
        this.publishedOn = publishedOn;

    }

    public void set_author1(String author1){
        this.author1 = author1;

    }

    public void set_author2(String author2){
        this.author2 = author2;

    }

    public void set_language(String language){
        this.language = language;

    }

    public void set_mainDomain(String mainDomain){
        this.mainDomain = mainDomain;

    }

    public String get_title(){
        return title;

    }

    public LocalDate get_publishedOn(){
        return publishedOn;

    }

    public String get_author1(){
        return author1;

    }

    public String get_author2(){
        return author2;

    }

    public String get_language(){
        return language;

    }

    public String get_mainDomain(){
        return mainDomain;

    }   
 
   //Methods=================================================================================================
    
}
