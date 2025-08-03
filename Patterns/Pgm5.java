package Patterns;
import java.util.Scanner;
public class Pgm5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }
    }
}

// Enter the number of rows: 
// 5

    // 1 2 3 4 5 

    // 2 3 4 5 

    // 3 4 5 

    // 4 5 

    // 5 