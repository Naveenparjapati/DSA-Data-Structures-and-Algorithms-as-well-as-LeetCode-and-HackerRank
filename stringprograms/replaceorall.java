package stringprograms;

public class replaceorall {
    public static void main(String[] args)
    {    //replace o with jj
        String str="hello";
        String res="";
        res=str.replace("ll","jj");
        System.out.print(res+" ");
        //remove all vowel
        res=str.replaceAll("[aeiouAEIOU]","");
        System.out.print(res);
        //[0-9] [A-Z] [A-Za-z]
    }
}
