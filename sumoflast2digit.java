public class sumoflast2digit {
    public static void main(String[] args)
    {
        int n=1234;
        int b=n%100;
        System.out.println(b);//3+4=7
        int sum=0,rem=0;
        while(b>0)
        {
            rem=b%10;
            sum +=rem;
            b=b/10;
        }
        System.out.println("sum of lasttwo digit "+sum);
    }
}
