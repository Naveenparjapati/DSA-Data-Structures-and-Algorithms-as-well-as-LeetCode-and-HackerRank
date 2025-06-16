package gernel;

import java.util.Arrays;

public class Anagramsir {
    public static void main(String[] args)
    {
        String str1="knife";
        String str2="wife";
        if(str1.length()==str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2))
            {
                System.out.print("anagram");
            }
            else {
                System.out.print("not anagram ");
            }
        }else{
            System.out.print("not anagram ");
        }

    }
}
