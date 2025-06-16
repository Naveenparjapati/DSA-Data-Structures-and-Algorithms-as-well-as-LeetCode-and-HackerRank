package recursion;

public class factorial {
    static int fact(int number)
    {
        if(number<=1)
        {
            return 1 ;
        }
        return number*fact(number-1);
    }
    public static void main(String[] args)
    {
        int ans=fact(5);
        System.out.print(ans);
    }

}
