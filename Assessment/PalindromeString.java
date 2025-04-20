package Assessment;
import java.util.Scanner;
public class PalindromeString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(isPali(str));


    }
    static String isPali(String str){
        String res = "";
        for(int i = str.length()-1; i >= 0; i--){
            res += str.charAt(i);
        }
        if(str.equalsIgnoreCase(res)){
            return "palindrome "+res;
        }
        else
         return "not palindrome";
        

    }
}
