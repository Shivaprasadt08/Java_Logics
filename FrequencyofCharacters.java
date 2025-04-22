import java.util.Scanner;

public class FrequencyofCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ch = new int[256];
        System.err.println(":Enter the string:");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            char c =  str.charAt(i);
            ch[c]++;
        }
        for(int i = 0; i < ch.length;i++){
            if(ch[i]>0){
                System.out.println((char)i+" "+ch[i]);
            }
        }
        sc.close();
    }
}
