public class RemoveAdjDuplicate {
    public static void main(String[] args) {
        
        String str = "Hello java i i i am here here to learn learn you you!!";
        String[] s1 = str.split(" ");
        String result ="";
        for(int i = 0; i < s1.length-1; i++){
            if(!s1[i].equals(s1[i+1])){
                 result += s1[i]+" ";
                
            }
        }
        System.err.println("Unique word sentence is :"+ result);
    }
}
