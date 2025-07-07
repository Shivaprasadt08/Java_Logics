import java.util.Arrays;
public class printConsArray {
    public static void main(String[] args){
        int[] arr = {4,22,1,32,3,2,64};
        // Bubble sort implementation
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //finding consecutive numbers in the array.
        System.out.println("Consecutive pairs in the array:");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                System.out.println(arr[i] + " ");
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] - arr[i] == 1) {
                System.out.println(arr[i + 1] + " ");
                break;
            }
        }
    }
}
