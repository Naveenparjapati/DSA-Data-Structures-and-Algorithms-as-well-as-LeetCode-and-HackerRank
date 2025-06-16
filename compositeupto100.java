public class compositeupto100 {
    public class Main {
        public static void main(String[] args)
        {
            int n=4;
            int count2=0;
            while(count2<100)
            {
                int count=0;
                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        count++;
                    }
                }
                if(count>=2)
                {
                    System.out.println("given number is composite "+n);
                }

                n++;
            }

        }
    }

}
