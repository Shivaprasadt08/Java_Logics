import java.util.Scanner;
class Sample13{
	static String  ConsPrint(String str){
		String res = "";
		str = str.replaceAll("[aeiouAEIOU]","");
		for(int i = str.length()-1; i >= 0; i--){
			res += str.charAt(i);
		}
		return res;
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string :\n");
	String str = sc.nextLine();
	System.out.println("Consonents in the Given string is :"+ ConsPrint(str));
}
}