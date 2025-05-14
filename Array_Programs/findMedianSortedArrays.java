package Array_Pgms;
class findMedianSortedArrays{
    public static double findMedianSortedArray(int a1[], int a2[]){
        int n = a1.length;
        int m = a2.length;
        int[] merged = new int[n + m];
        int i = 0,j =0, k = 0;
        while(i < n && j < m){
            if(a1[i] < a2[j]){
                merged[k++] = a1[i++];
            }else {
                merged[k++] = a1[j++];

            }
           
        }
        if(i < n){
            merged[k++] = a1[i++];
        }
        if(j < m){
            merged[k++] = a2[j++];
        }
        int total = n + m;
        if(total % 2 == 0){
        double res = (merged[total/2 - 1] + merged[total/2]) / 2.0;
        return res;
        }
        else {
            return merged[total/2];
        }
    }
    
    public static void main(String[] args){
        int[] a1 = {1,3};
        int[] a2 = {2,4,5,4};
        System.out.println("Median of the Sorted Array is : "+findMedianSortedArray(a1,a2));
    }
        

}
