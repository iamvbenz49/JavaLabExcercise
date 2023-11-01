package Extra;

public class ifElse {
    public static void main(String[] args) {
        int SUB1 = 60;
        int SUB2 = 68;
        int SUB3 = 97;
        int SUB4 = 48;
        int SUB5 = 57;
    
        float PER = 0.0F;
    
        PER = (SUB1 + SUB2 + SUB3 + SUB4 + SUB5) / 5;
    
        if (PER > 60) 
            System.out.println("First Division");
        else if (PER > 45) 
            System.out.println("Second Division");
        else if (PER > 35) 
            System.out.println("Third Division");
        else 
            System.out.println("Fail");
      }
}
