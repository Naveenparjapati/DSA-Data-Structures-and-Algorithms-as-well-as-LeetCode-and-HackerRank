package gernel;

public class tablereturn {
    static int digit(int i)
    {
        return 7*i;
    }
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++ )
        {
           System.out.println( digit(i) );
        }
    }
}