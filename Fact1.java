import java.util.Scanner;
class Fact{
	static int FactNum(int num){
	int fact = 1;
	for(int i = 1; i <= num; i++){
		fact *= i;
	}
	return fact;
	}
	public static void Main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :\n");
	int num = sc.nextInt();
	System.out.println("The factorial of the given number is :\n" + FactNum(num));
	}
}