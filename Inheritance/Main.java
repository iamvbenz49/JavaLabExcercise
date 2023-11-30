package Inheritance;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee rahul = new SalariedEmployee("Rahul", 3, 21);
        HourlyEmployee shaw = new HourlyEmployee("shaw", 8, 29);
        rahul.displayDetails();
        shaw.displayDetails();
    };
}
class Employee{
    String name;
    int id;
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void displayDetails(){
        System.out.println("Name of the employee : "+name);
        System.out.println("Employee Id : "+id);
    }
}
class SalariedEmployee extends Employee{
    int salary;
    public SalariedEmployee(String name,int id,int salary){
        super(name,id);
        this.salary = salary;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Monthly Salary : "+salary);
    }
}
class HourlyEmployee extends Employee{
    int salary;
    public HourlyEmployee(String name,int id,int salary){
        super(name,id);
        this.salary = salary;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Hourly Salary : "+salary);
    }
}
