
import java.util.Scanner;

public class String_Palindrome{
    public static void Palindrome(String s){
        boolean isPalindrome = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is Palindrome.");
        } else {
            System.out.println("The string is not Palindrome.");
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String s=sc.nextLine();
        Palindrome(s);
    }
}