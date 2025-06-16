package gernel;

public class sumscshot {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        int sum=5;

        for(int i=0;i<arr.length-1;i++)
        {
            if(sum==arr[i]+arr[i+1])
            {
                System.out.print("["+arr[i]+","+arr[i+1]+"]");
            }
            else if(arr[i]==sum)
            {
                System.out.print("["+arr[i]+"]");
            }
         }
    }
}
