
import java.util.Scanner;

public class PaliStrwithoutEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the String ypu want to check if it is a paplindrome or not...");
        String str = sc.next();
        isPali(str);
    }
    static void isPali(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.err.println("The given string is not a palindrome...");
            }
            i++;
            j--;
        }
        System.err.println("The given string is a Plaindrome... ");
    }
}
