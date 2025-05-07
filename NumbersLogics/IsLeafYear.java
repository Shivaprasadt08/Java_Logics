package NumbersLogics;
import java.util.Scanner;
public class IsLeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the you want to check leaf year or not : ");
        int year = sc.nextInt();
        if((year % 4 == 0 || year % 400 == 0)&&(year % 100 != 0))
        {
            System.err.println("The gien year is leaf year...");
        }
    }
}
