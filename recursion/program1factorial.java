package recursion;

public class program1factorial {
    static void  fun(int number)
    {
        if(number==0)
        {
            return ;
        }
        System.out.print(number);
        fun(number-1);


    }
    static void funreverce(int number)
    {
        if(number==0)
        {
            return ;
        }
        funreverce(number-1);
        System.out.print(number);
    }
    static void funboth(int number)
    {
        if(number==0)
        {
            return ;
        }
        System.out.println(number);
        funboth(number-1);
        System.out.println(number);
    }
    public static void main(String[] args)
    {
        fun(5);
//        funreverce(5);
//  funboth(5);

    }
}
