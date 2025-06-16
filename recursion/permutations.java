package recursion;

import java.util.ArrayList;

public class permutations {
    static int permutacount(String p,String up)
    {
        if(up.isEmpty())
        {

            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           count=count+ permutacount(f+ch+s,up.substring(1));
        }
return count;
    }
//22222222222222222
    static ArrayList<String> permutalist(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           a.addAll( permutalist(f+ch+s,up.substring(1)));
        }
       return a;
    }
//1111111111111111
    static void permuta(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permuta(f+ch+s,up.substring(1));
        }

    }


    public static void main(String[] args)
    {
 //11111111111111
//permuta("","abc");
  //222222222222222222
//        ArrayList<String> a= permutalist("","abc");
//        System.out.print(a);
 //3333333333333333333
        System.out.print(permutacount("","abc"));
    }
}
