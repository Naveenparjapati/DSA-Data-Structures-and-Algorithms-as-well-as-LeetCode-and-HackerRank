package stringprograms;

public class vowelcountinsentence {
    public static void countvowels(String str)
    {
      //  String[] sarray=str.split(" ");
        String replaceconstonent=str.replaceAll("[^aeiouAEIOU]","");
        System.out.println(replaceconstonent.length());
    }
    public static void main(String[] args)
    {
        String str="hi how many vowels ooo";
        countvowels(str);
    }
}
