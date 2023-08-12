package assets;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asset {
   //Class' attributes ======================================================================================
    private String idAsset;
    private LocalDate acquisitionDate;
    private String supplier;
    private LocalDate lastRevision;


    //Class' constructor =====================================================================================
    public Asset(LocalDate acquisitionDate, String supplier, LocalDate lastRevision){
        this.idAsset = generateId();
        this.acquisitionDate = acquisitionDate;
        this.supplier = supplier;
        this.lastRevision = lastRevision;
    }


    //Getters and Setters ====================================================================================
    public void set_supplier(String supplier){
        this.supplier = supplier;

    }

    public void set_lastRevision(LocalDate lastRevision){
        this.lastRevision = lastRevision;

    }

    public String get_supplier(){
        return supplier;

    }

    public LocalDate get_lastRevision(){
        return lastRevision;

    }

    public String get_idAsset(){
        return idAsset;

    }

    public LocalDate get_acquisitionDate(){
        return acquisitionDate;

    }


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
