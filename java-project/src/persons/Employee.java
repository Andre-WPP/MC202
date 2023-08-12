package persons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import persons.Person;

public class Employee extends Person{
   //Class' attributes ======================================================================================
    private String level;
    private float salary;
    private LocalDate startedOn;
    private LocalDate lastVaccation;
    private LocalDate firstHalfSalary;
    private LocalDate secondHalfSalary;


    //Class' constructor =====================================================================================
    public Employee(String level, float salary, LocalDate startedOn, LocalDate lastVaccation, LocalDate firstHalfSalary, LocalDate secondHalfSalary){
        super();
        this.level = level;
        this.salary = salary;
        this.startedOn = startedOn;
        this.lastVaccation = lastVaccation;
        this.firstHalfSalary = firstHalfSalary;
        this.secondHalfSalary = secondHalfSalary;


    }


    //Getters and Setters ====================================================================================
    


    //Methods=================================================================================================
    //Generates the id for object
    private String generateId(){
        final LocalDateTime apointinTime = java.time.LocalDateTime.now();
        return apointinTime.toString();
    }
    
}
