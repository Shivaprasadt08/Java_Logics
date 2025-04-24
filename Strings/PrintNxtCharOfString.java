package STR_PgmsOnTypecasting;

public class PrintNxtCharOfString {
    public static void main(String[] args){
        String str = "Methods";
        String res = "";
        for(int i  = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            res += (char) (ch+1);
        }
        System.out.println("Result of the Given string is: "+res);

    }
}
