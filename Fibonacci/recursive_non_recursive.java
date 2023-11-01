package Fibonacci;

public class recursive_non_recursive {
    public static void main(String[] args) {
        System.out.println("Iteration : "+iteration(5));
        System.out.println("Recursion : "+recursion(5));
    }
    public static int recursion(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*recursion(n-1);
    }
    public static int iteration(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
