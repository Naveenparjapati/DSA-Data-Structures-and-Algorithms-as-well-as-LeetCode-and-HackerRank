package gernel;

public class unicqcharacterfromstring {
    public static void main (String[] args)
    {
        String str="java automation";
        System.out.print(str+" ");
        unicqch(str);
    }
    static void unicqch(String str)
    {
        boolean[] unique=new boolean[128];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!unique[ch])
            {
                unique[ch]=true;
                System.out.print(ch +"");
            }
        }
    }
}
