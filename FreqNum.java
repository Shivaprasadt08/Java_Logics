public class FreqNum {
    public static void main(String[] args) {
        int num = 1012244456;
        int [] freq = new int[20];
        int i = 0;
        int copy = num;
        while(num > 0){
            int rem = num%10;
            freq[rem]++;
            num /= 10;
        }
        System.out.println("frequency of each digit in the number "+copy+"is :");
        for(i = 0; i < freq.length; i++){
            if(freq[i]> 0){
                System.out.println("Frequency of "+ i+ " is : "+ freq[i]);
            }
        }
         
    }
}

