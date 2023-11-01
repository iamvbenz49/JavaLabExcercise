package Overloading;

class calculator{
    void add(int a,int b){
        System.out.println("The sum is : " + (a+b));
    }
    void add(double a,double b){
        System.out.println("The sum is : "+(a+b));
    }

    calculator(){
        System.out.println("Default constructor");
    }
    calculator(int a){
        System.out.println("Constructor with one arguement : "+ a);
    }
    calculator(int a,int b){
        System.out.println("Constructor with two arguemnet : " + a +" "+ b);
    }
}
public class overloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add(3,2);
        calc.add(2.6,7.4);
        calculator calc1 = new calculator(2);
        calculator calc2 = new calculator(2, 7);
    }

}
