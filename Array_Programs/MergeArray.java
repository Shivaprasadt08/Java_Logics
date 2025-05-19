package Array_Pgms;
import java.util.Arrays;
public class MergeArray {
    
    public static void main(String[] args) {
        int[] arr1 = {4,5,3,8};
        int[]  arr2 ={6,1,7,2};
        int[] tempArray = new int[arr1.length+arr2.length];
        
        for(int i = 0 ; i<arr1.length; i++){
            tempArray[i] =arr1[i];
        }
        for(int  i =0; i<arr2.length; i++){
            tempArray[arr1.length + i] =arr2[i];
        }
          Arrays.sort(tempArray);
        for(int i =0; i <tempArray.length; i++){
              System.out.print(tempArray[i] + " ");
        }
        
    }
}

