import java.util.Scanner;
public class Reverse2stHalfString {
	
	static String rev2sthalf(String str) {
		String res = "";
		for(int i = str.length()-1; i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int mid = ((0 + str.length()-1)/2 + 1);
		
		String str1_h = str.substring(0, mid);
		
		String res1 = rev2sthalf(str.substring(mid));
		String str2 = str.substring(mid);
		System.out.println(str1_h+res1);
		sc.close();
	}

}