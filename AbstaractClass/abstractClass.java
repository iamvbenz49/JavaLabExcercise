package AbstaractClass;

public class abstractClass {
    public static void main(String[] args) {
        circle cir = new circle(5);
        System.out.println(cir.calculateArea());
        square sq = new square(10);
        System.out.println(sq.calculateArea());
    }
}
abstract class Shape{
    public abstract int calculateArea();

    public void displayMessage(){
        System.out.println("This is a shape");
    }
}
class circle extends Shape{
    private int radius;
    public circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int) (2*3.14*radius*radius);
    }
}
class square extends Shape{
    private int side;
    public square(int side){
        this.side = side;
    }
    @Override
    public int calculateArea() {
        return side*side;
    }
}