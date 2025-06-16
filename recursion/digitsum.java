package recursion;

public class digitsum {
    static int digitsum(int number)
    {
        if(number==0)
        {
            return  0;
        }
        return (number%10)+(digitsum(number/10));
    }
    static int digitproduct(int number)
    {
//        if(number<=1)
//        {
//            return  1;
//        }
        if((number%10)==number)
        {
            return  number;
        }
        return (number%10)*(digitproduct(number/10));
    }
    public static void main(String[] args)
    {
        int ans=digitproduct(1234);
        System.out.print(ans);
    }
}
