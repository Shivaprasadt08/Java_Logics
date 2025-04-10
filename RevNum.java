public class RevNum {
    public static void main (String [] args){
        int num = 123;
        int copy = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum*10+(rem);
            num = num/10;
        }
        System.out.println("The reverse of the Given number is: "+ sum );
        if (sum == copy){
            System.out.println("The given number is Palindrome Number");
        }
        else{
            System.out.println("The given number is not a palindrome number");
        }
        
    }
}
