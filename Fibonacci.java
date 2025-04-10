
class Fibonacci{
    // Scanner input = new Scanner(System.in)
    public static void main(String [] args){
        int n1 = 0 ;int n2 = 1; int num =10;
        for(int i = 0; i < num; i++){
            System.out.println(n1+"\n");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}