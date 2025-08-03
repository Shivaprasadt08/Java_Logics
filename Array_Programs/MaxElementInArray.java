<<<<<<< HEAD:Array_Programs/MaxElementInArray.java
package Array_Pgms;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,5,80,200,7,3};
        int i = 0;
        int j = arr.length-1;
        int max = 0;
       while(i < j){
            if(arr[i] < arr[j]){
                max = arr[j];
            }
            else{
                max = arr[i];
            }
            i++;
            j--;
        }
        System.out.println("Max element af the array is :"+ max);
        
    }
}
=======
package Array_Pgms;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,5,80,200,7,3};
        int i = 0;
        int j = arr.length-1;
        int max = 0;
       while(i < j){
            if(arr[i] < arr[j]){
                max = arr[j];
            }
            else{
                max = arr[i];
            }
            i++;
            j--;
        }
        System.out.println("Max element af the array is :"+ max);
        
    }
}
>>>>>>> fa22df6 (Saving changes before rebase):Array_Pgms/MaxElementInArray.java
