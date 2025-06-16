package gernel;
import java.util.Scanner;
public class palindromnumber {
    public static boolean palinornot(int n)
    {
        int orign=n;
        int rev=0;
        while(n!=0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        return orign==rev;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int  number= input.nextInt();
        if(palinornot(number))
        {
            System.out.print("palindrom ");
        }
        else {
            System.out.print("not palindrom ");
        }
    }
}
