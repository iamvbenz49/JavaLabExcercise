package EmployeeDetails;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Kl Rahul", 31, "WK BATSMAN", 2000000.12);
        System.out.println(emp.getAge());
        System.out.println(emp.getName());
        System.out.println(emp.getRole());
        System.out.println(emp.getSalary());
    }
}
class Employee{
    private String name;
    private int age;
    private String role;
    private double salary;
    public Employee(String name,int age,String role,double salary){
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getRole(){
        return role;
    }
    public double getSalary(){
        return salary;
    }
}
