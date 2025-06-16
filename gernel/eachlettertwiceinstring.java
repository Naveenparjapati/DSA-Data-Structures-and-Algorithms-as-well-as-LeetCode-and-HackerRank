package gernel;

public class eachlettertwiceinstring {
    public static void main(String[] args)
    {
        String str="hello";
        String result=worddouble(str);
        System.out.print(result);
    }
    public static String worddouble(String str)
    {
        StringBuilder doublech=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            doublech.append(ch).append(ch);
        }
        return doublech.toString();
    }
}
