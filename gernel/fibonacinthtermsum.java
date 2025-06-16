package gernel;

public class fibonacinthtermsum {
    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.println(n1);
        int n=3;
        for(int i=2;i<=n;i++)
        {
            int next=n1+n2;
            sum+=next;
            System.out.println(next);
            n1=n2;
            n2=next;
        }
        System.out.print("sum is "+sum+"  ");
    }
}
