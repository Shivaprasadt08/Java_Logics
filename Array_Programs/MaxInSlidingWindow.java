package Array_Pgms;
import java.util.*;

public class MaxInSlidingWindow {
    public static void printMaxInWindow(int[] r, int k) {
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < r.length; i++) {
            // Remove elements out of current window from front
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (than current) from back
            while (!dq.isEmpty() && r[dq.peekLast()] < r[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);  // add current element index

            // Print max of current window
            if (i >= k - 1) {
                System.out.print(r[dq.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] r = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        printMaxInWindow(r, k);
    }
}

// import java.util.Arrays;

// public class SlidingWindowMaxSwapping {

//     // Method to find max in each window using swapping
//     public static int[] findMaxInWindows(int[] arr, int k) {
//         int n = arr.length;
        
//         if (k > n) {
//             System.out.println("Window size is larger than array size!");
//             return new int[0];
//         }

//         int[] result = new int[n - k + 1]; // result array to hold max values

//         for (int i = 0; i <= n - k; i++) {
//             // We'll make a copy of the window to safely swap inside it (optional)
//             int max = arr[i];

//             // Find max by swapping values manually (for illustration)
//             for (int j = i + 1; j < i + k; j++) {
//                 if (arr[j] > max) {
//                     // swap max and arr[j] using temp variable
//                     int temp = max;
//                     max = arr[j];
//                     // Note: We are not modifying original array, just simulating swap
//                     // for understanding temp variable usage
//                 }
//             }

//             result[i] = max; // store the found max
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 12, 3, 5, 7, 8, 1};
//         int k = 3;

//         int[] result = findMaxInWindows(arr, k);
//         System.out.println("Maximum of each window: " + Arrays.toString(result));
//     }
// }
