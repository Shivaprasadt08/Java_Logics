
import java.util.Arrays;
import java.util.Scanner;

public class PushZeroEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {4,5,0,1,9,0,5,0};
        for(int i=0; i <n ; i++){
            for(int j = 0 ; j < n-1; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after pushing zeros at the end: "+Arrays.toString(arr));
    }
}
