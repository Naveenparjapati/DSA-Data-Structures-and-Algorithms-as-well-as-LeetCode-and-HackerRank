

public class armstrongnumber {
    public static void main(String[] args)
    {
        int n=153;
        int originalNumber = n;
        int sum=0;
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
         n=originalNumber;
        while(n!=0)
        {
            int rem=n%10;
            sum+=Math.pow(rem,count);
            n=n/10;
        }
        if(sum==originalNumber)
        {
            System.out.println("number is armstrong "+originalNumber);
        }
        else {
            System.out.print("number is not armstrong"+originalNumber);
        }
    }
}
