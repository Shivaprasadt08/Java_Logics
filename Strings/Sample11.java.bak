import java.util.Scanner;
class Sample11{
	static String palindrome(String str){
	String res = "";
		for(int i = str.length()-1; i >= 0; i--){
			res += str.charAt(i);
		}
		if(str.equals(res)){
		return ("Palindrome");
		}
		else {
		return ("Not Palindrome");
		}
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : \n");
	String str = sc.next();
	String res = palindrome(str);
	System.out.println(res);
	}
}