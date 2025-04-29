package NumbersLogics;
public class DisariumNum {
    public static void main(String[] args){
        int num = 135;
        int copy  = num;
        int sum = 0;
        String strNum = Integer.toString(num);
        for(int i = 0; i < strNum.length(); i++){
            int rem = Character.getNumericValue(strNum.charAt(i));
            sum += Math.pow(rem, i+1);
        }
        if (copy == sum){
            System.out.println("Given number is diesian number");            
        } else {
            System.out.println("Given number is NOT a Disarium number");
        }
    }
}
