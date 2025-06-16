package recursion;

public class revercenumber {
//    static int sum = 0;
//    static void  rev(int number)
//    {
//        if(number==0)
//        {
//            return;
//        }
//        int rem = number % 10;
//        sum=sum*10+rem;
//        rev(number/10);

//      return sum;
//    }
   static int sum = 0;
    static int  rev(int number)
    {
    if(number==0)
    {
        return 0;
    }
    int rem = number % 10;
    sum=sum*10+rem;
    rev(number/10);
    return sum;
}
static boolean palin(int n)
{
    if(n == rev(n)) {
        return true;
    }
    else{
        return false;
    }
}
//static int rev2(int number)
//{
//    //cometimes you might need some addditional variables in the argument
//    //in that case make another function
//}
    public static void main(String[] args){
//        rev(123);
//        System.out.print(sum);
        System.out.print(palin(1216));
    }
}
