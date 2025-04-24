package STR_PgmsOnTypecasting;

public class PrintInverseCapsCharInString {
    public static void main(String[] args) {
        String str = "MeThoDOverloDiNg";
        // int[] arr = new int[127];
        String res = "";
        for(int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            if(ch >= 'a'&& ch <= 'z'){
                res+=(char)(ch-32);
            }
            if(ch >= 'A'&& ch <= 'Z'){
                res+=(char)(ch+32);
            }
        }
        System.out.println("Result of the Given string is: "+res);

    }
    
}
