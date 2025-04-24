package STR_PgmsOnTypecasting;

public class CountVowels {
    public static void main(String[] args) {
        String str = "a_Methodoverlodinguuuu";
        int[] arr = new int[127];
        for(int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e'||ch == 'i' ||ch == 'o' ||ch == 'u'){
                arr[ch]++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.println((char)i + " " + arr[i]);
            }
        }
    }
    
}
