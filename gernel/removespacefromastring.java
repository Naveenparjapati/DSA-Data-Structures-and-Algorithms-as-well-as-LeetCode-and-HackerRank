package gernel;

public class removespacefromastring {
    public static void main(String[] args)
    {
        String str="welcome to java world";
        String resut=spaceremove(str);
        System.out.print(resut);
    }
    public static String spaceremove(String str)
    {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
