public class primeOptimal {
    public static void main(String[] args) {
        int n = 91;
        for(int i = 2; i <= Math.sqrt(n); i++){
          if(n % i == 0){
            System.out.println("not prime");
            break;
          }        
        
        }
        System.out.println("prime");

    }
    
}
