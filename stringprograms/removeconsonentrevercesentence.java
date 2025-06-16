package stringprograms;

public class removeconsonentrevercesentence {
        public static void countvowels(String str)
        {
            String consonantsOnly= str.replaceAll("[^aeiouAEIOU]", "");

            System.out.println("Number of consonants: " + consonantsOnly.length());
            String result="";
            for(int i=consonantsOnly.length()-1;i>=0;i--)
            {
                result=result+consonantsOnly.charAt(i);

            }
            System.out.print(result);
        }
        public static void main(String[] args)
        {
            String str="hi how many vowels ooo";
            countvowels(str);
        }
    }




