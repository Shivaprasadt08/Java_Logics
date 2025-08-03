package PriorityQueue;
import java.util.*;


public class findKthSmallest {
     public static void main(String[] args) {
        int[] nums = {3,2,2,1,1,5,6,4};
        int k = 3;
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.add(num);

        }
        for(int i = 0 ; i < k ; i++){
            maxHeap.poll();
        }
        System.out.println("The " + k + "th smallest element is: " + maxHeap.poll());
    }

}
