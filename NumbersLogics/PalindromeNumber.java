package NumbersLogics;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        int num = sc.nextInt();
        int copy = num;
        int rev= 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(copy == rev){
            System.out.println("Given number is Palindrome :"+rev);
        }
        else{
            System.out.println("Given number is not Palindrome :"+rev);
        }
        
    }
}


