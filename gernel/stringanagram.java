package gernel;

public class stringanagram {
    public static void main(String[] args)
    {
        String str1="listen";
        String str2="silent";
        System.out.print(anagram(str1,str2));
    }
    static boolean anagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int[] charcount=new int[256];
        for(int i=0;i<str1.length();i++)
        {
            charcount[str1.charAt(i)]++;
            charcount[str2.charAt(i)]--;
        }
        for(int count:charcount)
        {
            if(count !=0)
            {
                return false;
            }
        }
        return true;
    }
}
