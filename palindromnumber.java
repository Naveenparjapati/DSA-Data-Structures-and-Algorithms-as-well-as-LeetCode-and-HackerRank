public class palindromnumber {
    public static void main(String[] args)
    {
        int n=121,rem,rev=0;
        int copy=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }


        if(copy==rev)
        {
            System.out.print("number is palindrom");
        }
        else {
            System.out.print("number is not palindrom");
        }
    }
}
