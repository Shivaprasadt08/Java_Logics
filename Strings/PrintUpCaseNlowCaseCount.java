package STR_PgmsOnTypecasting;

public class PrintUpCaseNlowCaseCount {
    public static void main(String[] args){
        String  str = "OverLOAdIng";
        int uc  = 0, lc = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch <= 'z'){
                lc++;
            }
            if(ch>='A' && ch <= 'Z'){
                uc++;
            }
        } 
        System.err.println("Uppercase: "+uc);
        System.err.println("lowercase: "+lc);
    }
}

// package STR_PgmsOnTypecasting;

// public class PrintUpCaseNlowCaseCount {
//     public static void main(String[] args){
//         String  str = "OverLOAdIng";
//         int uc  = 0, lc = 0;
//         char[] arr = str.toCharArray();
//         for(int i = 0; i < str.length(); i++){
//             int ascii = (int)(arr[i]);
        
//             if(ascii>=97 && ascii<= 122){
//                 lc++;
//             }
//             if(ascii>=65 && ascii<= 90){
//                 uc++;
//             }
//         } 
//         System.err.println("Uppercase: "+uc);
//         System.err.println("lowercase: "+lc);
//     }
// }
