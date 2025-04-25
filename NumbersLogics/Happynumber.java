package NumbersLogics;
import java.util.Scanner;
public class Happynumber {
    static int sumOfSquare(int n){
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum += Math.pow(2,rem);
                n /= 10;
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a anumber to check if it is a happy number or not: ");
        int n = sc.nextInt();
        while(n>9){
            n = sumOfSquare(n);

        }
        if(n == 1 || n == 7){
            System.out.println("The given number is happy number");
        }
        else{
            System.out.println("The given number is not happy number");
        }
    }
    
}
