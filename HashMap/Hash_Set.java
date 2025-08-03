package HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2 ,3, 4, 2, 3};

Set<Integer> set = new HashSet<>();
for (int num : nums) {
    if (!set.add(num)) {
        System.out.println("Duplicate: " + num);
    }
}
        System.out.println("Set contains: " + set);
        System.out.println("Size of the set: " + set.size());
    }
}
