package Extra;

public class oddEven {
    public static void main(String[] args) {
        int NUM = 0;
        String STR = "Hello World";
    
        NUM = STR.length();
    
        if (NUM % 2 == 0) {
          System.out.println("NUM is EVEN number");
        }
        else {
          System.out.println("NUM is ODD number");
        }
    }
}
