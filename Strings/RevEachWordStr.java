import java.util.Scanner;
public class RevEachWordStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] s = str.split(" ");
        String res = "";
        for(int i = s.length-1; i >= 0; i--){
             res += s[i]+" ";
        }
        System.out.println(res);
    }
}
