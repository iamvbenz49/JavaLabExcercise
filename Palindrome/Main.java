package Palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("malayalam : "+ isPalindrome("malayalam"));
    }
    static boolean isPalindrome(String s){
        int i = 0,j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}
