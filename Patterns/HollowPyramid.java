package Patterns;
public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = n; s > i; s--) System.out.print(" ");
            // stars & hollow logic
            for (int j = 1; j <= 2*i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2*i -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// output:
//     *    
//    * *   
//   *   *  
//  *     * 
// *********
