package leetcode;

public class AnagramWithoutInbuilt {

    public static boolean  anagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int[] arr=new int[256];

        for(int i=0;i<str1.length();i++)
        {
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i:arr)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String str1 = "anagram";
//        String str2 = "gramana";
        String str1 = "cat";
        String str2 = "tac";
       System.out.println(anagram(str1,str2));
    }
}
