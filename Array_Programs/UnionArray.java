package Array_Pgms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
         Integer[] arr1 = {1,2,3};
         Integer[] arr2 = {2,3,4,8};
         Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
         set1.addAll(Arrays.asList(arr2));
         System.err.println("Union of 2 Arrays: "+ set1);
    }
}
