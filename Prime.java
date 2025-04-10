public class Prime {
    public static void main(String[] args) {
        int num = 71;
        boolean flag = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                // System.out.println("The given number is not a prime number");
                flag = false;
                break;
            }
            
        }
        if (flag == true){
             System.out.println("The given number is a prime number");

        }
        else{
             System.out.println("The given number is not a prime number");

        }
    }
}
