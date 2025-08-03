package Array_Pgms;

public class findSecLrgeElement {
    public static void main(String[] args) {
    int []  arr = {5,2,6,78,89,52,100,36};
    int temp;
    for( int i =0 ; i < arr.length ; i++){
        for(int j = i+1 ; j < arr.length; j++){
            if(arr[i] > arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        
    }
    System.out.println("Second Largest element in the array is :" + arr[arr.length-2]);
}
}
