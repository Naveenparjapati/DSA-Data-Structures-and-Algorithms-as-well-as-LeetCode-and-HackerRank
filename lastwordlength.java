public class lastwordlength {
    public static void palindroncheck(String s)
    {
        String[] sp=s.split(" ");
        // System.out.print(sp);
        String lentbigword="";
        for(int i=0;i<sp.length;i++) {

            if(sp[i]!=" ")
            {
                lentbigword=sp[i];
            }
        }
        System.out.print(lentbigword.length()+" ");
    }
    public static void main(String[] args)
    {
        String s="my mom said to lern poimalayalam but i am from oiioiuyykatak place it is gadag district";
        palindroncheck(s);
    }
}
