public class ReverseStrWithoutLoop {
    public static void main(String[] args) {
        String  str = "Kanak";
        System.out.println(Reverse(str)); 
    }

    public static String Reverse(String str){
        if(str.isEmpty()){
            return (str);
        }else{
            return Reverse(str.substring(1)) + str.charAt(0);
        }
    }
}

