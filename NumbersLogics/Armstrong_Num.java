package NumbersLogics;
public class Armstrong_Num {
    public static void main(String[] args) {
        int num = 153;
        int n1 = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += Math.pow(rem,3);
            num /= 10;
        }
        if(n1 == sum){
            System.out.println("Given number is Armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
