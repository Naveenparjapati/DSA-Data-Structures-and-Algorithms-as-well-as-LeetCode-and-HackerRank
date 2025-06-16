public class missingnumberinarray {

    public static void main(String[] args)
    {   //(n*(n+1))/2
        int[] arr={3,4,5,1,6,7,8,9,10};
        int n=arr.length+1;//one number is missing so arrazy length is +1

        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
        }
        System.out.println(sum);
    }
}
