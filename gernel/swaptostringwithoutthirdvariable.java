package gernel;

public class swaptostringwithoutthirdvariable {
    public static void main(String[] args)
    {
        String s1="hello";
        String s2="java";
        System.out.println("before swaping "+s1+" "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.print("afterre swaping"+s1+" "+s2);
    }
}
