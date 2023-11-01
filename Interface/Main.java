package Interface;

public class Main {
    public static void main(String[] args) {
        circle cir = new circle(5);
        System.out.println(cir.calculateArea());
        square sq = new square(10);
        sq.draw();
        System.out.println(sq.calculateArea());
    }
}

interface shape{
    void draw();
}

abstract class AbstractShape implements shape{
    public void draw(){
        System.out.println("This is a shape");
    }
    abstract int calculateArea();
}
class circle extends AbstractShape{
    private int radius;
    public circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int) (2*3.14*radius*radius);
    }
}
class square extends AbstractShape{
    private int side;
    public square(int side){
        this.side = side;
    }
    @Override
    public int calculateArea() {
        return side*side;
    }
}

