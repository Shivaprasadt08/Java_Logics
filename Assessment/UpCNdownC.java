package Assessment;

public class UpCNdownC {
    public static void main(String[] args) {
        String str = "hello";
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            char res =(char) (ch+4);
            System.err.println(res);
        }
    }
}
