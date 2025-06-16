package stringprograms;

public class reversesentencewithfunction {
    public static void reversestring(String str)
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            result=result+str.charAt(i);
        }
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        String str="hello java";
        String[] s1=str.split(" ");//["hello","java"]
        for(int i=0;i< s1.length;i++)
        {
            reversestring(str);
        }
        }
}
