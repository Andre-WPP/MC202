package std;

import java.time.LocalDateTime;
import persons.Employee;

public class Library {
   //Class' attributes ======================================================================================
    private String id;
    private String name;
    private String cnpj;
    private String address;
    private int capacity;
    private int rating;
    private int qtyitems;
    private Sector sector[]; //Composition
    private Employee employee[]; //Agregation


    //Class' constructor =====================================================================================
    public Library(String name, String cnpj, String address, int capacity, int rating, int qtyitems, Sector sector[], Employee employee[]){
        this.id = generateId();
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
        this.capacity = capacity;
        this.rating = rating;
        this.qtyitems = qtyitems;
        this.sector = sector;
        this.employee = employee;

    }


    //Getters and Setters ====================================================================================
    public void set_name(String name){
        this.name = name;
    }

    public void set_cnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void set_address(String address){
        this.address = address;
    }

    public void set_capacity(int capacity){
        this.capacity = capacity;
    }

    public void set_rating(int rating){
        this.rating = rating;
    }

    public void set_sector(Sector sector[]){
        this.sector = sector;
    }

    public void set_qtyitems(int qtyitems){
        this.qtyitems = qtyitems;
    }

    public void set_employee(Employee employee[]){
        this.employee = employee;
    }

    public String get_id(){
        return id;
    }

    public String get_name(){
        return name;
    }

    public String get_cnpj(){
        return cnpj;
    }

    public String get_address(){
        return address;
    }

    public int get_capacity(){
        return capacity;
    }

    public int get_rating(){
        return rating;
    }

    public Sector[] get_sector(){
        return sector;
    }

    public int get_qtyitems(){
        return qtyitems;
    }

    public Employee[] get_employee(){
        return employee;
    }


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
