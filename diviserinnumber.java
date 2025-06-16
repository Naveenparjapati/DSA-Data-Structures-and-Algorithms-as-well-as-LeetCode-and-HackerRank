public class diviserinnumber {
    public static void main(String[] args)
    {
        int n=1234,id=0;//2
        int temp=n;
        int count=0;
        while(n>0)
        {
            id=n%10;
            if(temp%id==0)
            {
                count++;
            }
            n=n/10;

        }
        System.out.println(count);

    }
}
