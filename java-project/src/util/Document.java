package util;

import java.time.LocalDateTime;

public class Document {
  //Class' attributes ======================================================================================
    private String idDocument;
    private String documentType;
    private String docNumber;



    //Class' constructor =====================================================================================
    public Document(String documentType, String docNumber){
        this.idDocument = generateId();
        this.documentType = documentType;
        this.docNumber = docNumber;

    }


    //Getters and Setters ====================================================================================
    public void set_documentType(String documentType){
        this.documentType = documentType;
    }

    public void set_docNumber(String docNumber){
        this.docNumber = docNumber;
    }

    public String get_idDocument(){
        return idDocument;
    }

    public String get_documentType(){
        return documentType;
    }

    public String get_docNumber(){
        return docNumber;
    }
    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
