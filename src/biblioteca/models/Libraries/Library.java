package biblioteca.models.Libraries;

import biblioteca.models.Util.Address;
import biblioteca.models.Libraries.Shelf;
import biblioteca.models.Members.Colaborator;

public class Library {

    //Declaração dos atributos
    private String id;
    private String name;
    private String cnpj;
    private Address address;
    private int capacity; //Quantas pessoas a biblioteca comporta
    private double rating;
    private int qtyItems;
    private Shelf[] shelves;
    private Colaborator[] colaborators;

    //Construtor
    public Library(
        String id,
        String name,
        String cnpj,
        Address address,
        int capacity,
        double rating,
        int qtyItems,
        Shelf[] shelves,
        Colaborator[] colaborators
        ){
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
        this.capacity = capacity;
        this.rating = rating;
        this.qtyItems = qtyItems;
        this.shelves = shelves;
        this.colaborators = colaborators;
    }

    //Getters e Setters
    public String get_id(){
        return id;
    }

    public String get_name(){
        return name;
    }

    public String get_cnpj(){
        return cnpj;
    }

    public Address get_address(){
        return address;
    }

    public int get_capacity(){
        return capacity;
    }

    public double get_rating(){
        return rating;
    }

    public int get_qtyItems(){
        return qtyItems;
    }

    public Shelf[] get_shelves(){
        return shelves;
    }

    public Colaborator[] get_colaborators(){
        return colaborators;
    }


    public void set_id(String id){
        this.id = id;
    }

    public void get_name(String name){
        this.name = name;
    }

    public void get_cnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void get_address(Address address){
        this.address = address;
    }

    public void get_capacity(int capacity){
        this.capacity = capacity;
    }

    public void get_rating(double rating){
        this.rating = rating;
    }

    public void get_qtyItems(int qtyItems){
        this.qtyItems = qtyItems;
    }

    public void get_shelves(Shelf[] shelves){
        this.shelves = shelves;
    }

    public void get_colaborators(Colaborator[] colaborators){
        this.colaborators = colaborators;
    }



    //Métodos

    
}
