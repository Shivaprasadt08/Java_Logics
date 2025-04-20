package Assessment;
import java.util.Scanner;

public class RevStringWithoutCharAt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.next();
    System.out.println( chechRevstr(str));
    sc.close();
    }
    static String chechRevstr(String str){
        char[] ch = str.toCharArray();
        String res = "";
        for(int i =ch.length-1; i >= 0; i--){
            res+=ch[i];
        }
        return res;
    }
    
}

