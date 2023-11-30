package tryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int res = 100/n;
            System.out.println(res);
        } catch(ArithmeticException e){
            System.out.println("dont enter zero");
        }catch (NumberFormatException e){
            System.out.println("Enter the correct format");
        }catch(Exception e){
            System.out.println("Unknown Error occured");
        }
        finally{
            System.out.println("Ellam Mudinchu");
        }
    }
}
