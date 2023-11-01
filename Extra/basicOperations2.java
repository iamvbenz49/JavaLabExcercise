package Extra;

public class basicOperations2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
    
        c = ++a + ++b * 2 + a++;
    
        System.out.println(a + "," + b + "," + c);
    }
}
