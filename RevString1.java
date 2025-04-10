
public class RevString1 {
    public static void main(String[] args) {
     String str = "Shiva";
     palindrome(str);   
    }

    static void palindrome(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i <j){
            if(ch[i] != ch[j]){
                System.out.println("not pali str");
                return;
            }
            i++;
            j--;
        }
        System.out.println(" pali string");

            
        }
    }


