package Patterns;
import java.util.Scanner;
public class Pgm4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2 * (n-1);
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+" ");
            }
              for(int j = 1 ; j <= space; j++){
                System.out.print(" ");
            }
        //   System.out.println("\n");
            for(int j = i ; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println("\n");
            space -= 2;
        }
        
    }
}
