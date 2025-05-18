package Array_Pgms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {2,3,4};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);
        System.out.println("Intersection of the two arrays: " + set1);
    }
}
