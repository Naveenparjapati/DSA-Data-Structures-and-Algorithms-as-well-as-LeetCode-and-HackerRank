package leetcode;

import java.util.Arrays;

public class Anagramawithainbuilt {
    public static boolean isAnagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
               if(Arrays.equals(ch1,ch2))
               {
                   return true;
               }
               else{
                   return false;
               }
    }


    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "gramana";
        System.out.println(isAnagram(str1,str2));
    }
}
