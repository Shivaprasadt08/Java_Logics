class Fibonacci{
    // Scanner input = new Scanner(System.in)
    static int fib(int n1){
        if(n1 == 0){
            return 0;
        }
        else if(n1 == 1){
            return 1;
        }
        else{
            return fib(n1-1) + fib(n1-2);
        }
       
    }
    public static void main(String [] args){
        int n1 = 8;
        System.err.println(fib(n1));
    }
}