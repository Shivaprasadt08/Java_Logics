package Array_Pgms;

public class MaxElementKtimes {
    public static int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int maxSoFar = arr[i];
            int countMax = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > maxSoFar) {
                    maxSoFar = arr[j];
                    countMax = 1;
                } else if (arr[j] == maxSoFar) {
                    countMax++;
                }

                if (countMax >= k) {
                    result++;
                }
            }

            // Include the single-element subarray
            if (k == 1) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 3};
        int k = 2;
        System.out.println("Count = " + countSubarrays(arr, k));  // Output: 4
    }
}

