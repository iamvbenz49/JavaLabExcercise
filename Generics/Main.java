package Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>(20);
        Box<String> strBox = new Box<String>("hello");
        System.out.println(intBox.getValue());
        intBox.setValue(21);
        intBox.displayType();
        System.out.println();
        System.out.println(strBox.getValue());
        strBox.setValue("bye");
        strBox.displayType();
    }
}
class Box<T>{
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T val){
        this.value = val;
    }
    public void displayType(){
        System.out.println(value.getClass().getSimpleName());
    }
}
