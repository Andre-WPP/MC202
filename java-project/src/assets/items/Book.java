package assets.items;

import java.time.LocalDate;

public class Book extends Item {
   //Class' attributes ======================================================================================
    private String title;
    private String subTitle;
    private LocalDate publishedOn;
    private String publishedAt;
    private String publisher;
    private String edition;
    private String author1;
    private String author2;
    private String series;
    private String language;
    private String mainDomain;
    private String gender;
    private int numberPages;
    private String coverType;


    //Class' constructor =====================================================================================
    public Book (
        LocalDate acquisitionDate, 
        String supplier, 
        LocalDate lastRevision, 
        int qty,
        String title,
        String subTitle,
        LocalDate publishedOn,
        String publishedAt,
        String publisher,
        String edition,
        String author1,
        String author2,
        String series,
        String language,
        String mainDomain,
        String gender,
        int numberPages,
        String coverType){

        super(acquisitionDate, supplier, lastRevision, qty);
        this.title = title;
        this.subTitle = subTitle;
        this.publishedOn = publishedOn;
        this.publishedAt = publishedAt;
        this.publisher = publisher;
        this.edition = edition;
        this.author1 = author1;
        this.author2 = author2;
        this.series = series;
        this.language = language;
        this.mainDomain = mainDomain;
        this.gender = gender;
        this.numberPages = numberPages;
        this.coverType = coverType;

    }


    //Getters and Setters ====================================================================================
    public void set_title(String title){
        this.title = title;

    }

    public void set_subTitle(String subTitle){
        this.subTitle = subTitle;

    }

    public void set_publishedOn(LocalDate publishedOn){
        this.publishedOn = publishedOn;

    }

    public void set_publishedAt(String publishedAt){
        this.publishedAt = publishedAt;

    }

    public void set_publisher(String publisher){
        this.publisher = publisher;
        
    }

    public void set_edition(String edition){
        this.edition = edition;

    }

    public void set_author1(String author1){
        this.author1 = author1;

    }

    public void set_author2(String author2){
        this.author2 = author2;

    }

    public void set_series(String series){
        this.series = series;

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

    public void set_numberPages(int numberPages){
        this.numberPages = numberPages;

    }
    public void set_coverType(String coverType){
        this.coverType = coverType;

    }

    public String get_title(){
        return title;

    }

    public String get_subTitle(){
        return subTitle;

    }

    public LocalDate get_publishedOn(){
        return publishedOn;

    }

    public String get_publishedAt(){
        return publishedAt;

    }

    public String get_publisher(){
        return publisher;
        
    }

    public String get_edition(){
        return edition;

    }

    public String get_author1(){
        return author1;

    }

    public String get_author2(){
        return author2;

    }

    public String get_series(){
        return series;

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

    public int get_numberPages(){
        return numberPages;

    }
    public String get_coverType(){
        return coverType;

    }


    //Methods=================================================================================================
    
}
