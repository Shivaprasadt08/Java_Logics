package Strings;

import java.util.Arrays;

public class Anagram {

    public static String isAnagram(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if( Arrays.equals(a1, a2)){
            return "Anagram String";
        }
        else{
            return "Not Anagram";
        }

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }
}
