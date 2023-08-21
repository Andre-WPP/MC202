package persons;

import java.time.LocalDate;
//import persons.Person;

import util.Account;
import util.Document;

//extends Person
public class Employee extends Person{
   //Class' attributes ======================================================================================
    private String level;
    private float salary;
    private LocalDate startedOn;
    private LocalDate lastVaccation;
    private LocalDate firstHalfSalary;
    private LocalDate secondHalfSalary;


    //Class' constructor =====================================================================================
    public Employee(
        Document document,
        String cel,
        Account account,
        String name,
        String lastName,
        char gender,
        String occupation, 
        String level, 
        float salary, 
        LocalDate startedOn, 
        LocalDate lastVaccation, 
        LocalDate firstHalfSalary, 
        LocalDate secondHalfSalary){

        super(document, cel, account, name, lastName, gender, occupation);
        this.level = level;
        this.salary = salary;
        this.startedOn = startedOn;
        this.lastVaccation = lastVaccation;
        this.firstHalfSalary = firstHalfSalary;
        this.secondHalfSalary = secondHalfSalary;


    }


    //Getters and Setters ====================================================================================

        public void set_level(String level){
            this.level = level;
        }
        public void set_salary(float salary){
            this.salary = salary;
        }
        public void set_lastVaccation(LocalDate lastVaccation){
            this.lastVaccation = lastVaccation;
        }
        public void set_firstHalfSalary(LocalDate firstHalfSalary){
            this.firstHalfSalary = firstHalfSalary;
        }
        public void set_secondHalfSalary(LocalDate secondHalfSalary){
            this.secondHalfSalary = secondHalfSalary;
        }


        public String get_level(){
            return level;
        }
        public float get_salary(){
            return salary;
        }

        public LocalDate get_startedOn(){
            return startedOn;
        }

        public LocalDate get_lastVaccation(){
            return lastVaccation;
        }
        public LocalDate get_firstHalfSalary(){
            return firstHalfSalary;
        }
        public LocalDate get_secondHalfSalary(){
            return secondHalfSalary;
        }

    //Methods=================================================================================================


    
}
