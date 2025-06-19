package leetcode;

public class Permutation {

    public static void permuta(String prefix,String str)
    {
        if(str.length()==0)
        {
           System.out.println(prefix);
           return;      //return statement
        }
        char ch=str.charAt(0);//taking character

        for(int i=0;i<prefix.length();i++)//prefix length
        {
            String f=prefix.substring(0,i);
            String s=prefix.substring(i,prefix.length());
            permuta(f+ch+s,str.substring(1));
        }
    }


    public static void main(String[] args) {
        String str = "abc";
       permuta(" ",str);
    }
}
