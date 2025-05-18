package NumbersLogics;
import java.util.Scanner;
public class BinaryNumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to convert into Binary: ");
        int num = sc.nextInt();
        sc.close();
        String BinaryNumber = "";
        while(num > 0){
            int rem = num % 2;
            BinaryNumber = rem + BinaryNumber;
            num = num / 2;

        }
        System.out.println("Binary Number of the Given NUmber is: "+BinaryNumber); 
    }
}
