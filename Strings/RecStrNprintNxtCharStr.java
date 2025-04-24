package STR_PgmsOnTypecasting;

public class RecStrNprintNxtCharStr {
        public static void main(String[] args){
            String str = "Methods";
            String res = "";
            String res1 = "";
            for(int i  = str.length()-1; i >= 0; i--){ 
                res += str.charAt(i);
            }
            for(int i  = 0; i < res.length(); i++){
                char ch = res.charAt(i);
                res1 += (char) (ch+1);
            }
            System.out.println("Result of the Given string is: "+res1);
    
        }
    
}
