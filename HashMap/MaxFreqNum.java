package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreqNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n; i++){
        System.out.println("Enter the element :");
        arr[i] = sc.nextInt();
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);

    }
    System.out.println("Frequency of elements in the array:");
    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        if(entry.getValue() > n/2){
            int a = entry.getValue();
            System.out.println("Element: "+ entry.getKey() + "\t Frequency: " + a);
        }
    }
}
}
