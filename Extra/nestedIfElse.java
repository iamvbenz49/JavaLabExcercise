package Extra;

public class nestedIfElse {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;
    
        if (B > A) {
          if (A > C) {
            System.out.println("ABC");
          }
          else {
            if (C > B) {
              System.out.println("GHI");
            }
            else {
              System.out.println("LMN");
            }
          }
        }
        else {
          System.out.println("PQR");
        }
      }
}
