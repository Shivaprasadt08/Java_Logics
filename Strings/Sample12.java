import java.util.Scanner;
class Sample12{
	static String RevSentence(String str){
	String[] s1 = str.split(" ");
	String rev="";
	for(int i = s1.length-1 ; i >= 0; i--){
		rev += s1[i]+" ";
	}
	return rev;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :\n");
		String res = sc.nextLine();
		System.out.println("Reverse of the given String is :\n" + RevSentence(res) );
	}
}