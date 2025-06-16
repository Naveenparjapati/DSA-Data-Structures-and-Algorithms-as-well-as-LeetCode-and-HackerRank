public class prime1100 {

    public static void main(String[] args)
    {
        int n=2;
        int count=0;

        while(count<100)
        {
            boolean temp=true;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    temp=false;
                    break;
                }
            }

            if(temp) {
                System.out.println(n);
            }
            n++;
        }
    }
}


