package Extra;

public class while1 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
    
        while (i < 5) {
          num = (++i * i++*2 + 1);
          System.out.println(num);
        }
      }
}
