package predrive;

public class sqrtroot {
    static int floatsqr(int n)
    {
        int res=1;
        while(res*res<=n)
        {
            res++;
        }
        return res-1;
    }
    public static void main(String[] args)
    {
        int n=144;
        System.out.print(floatsqr(n));
    }
}
