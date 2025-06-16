public class largest {
    public static int largestarr(int[] arr)
    {
        int largest=arr[0];

        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>largest)
           {

               largest=arr[i];
           }

        }
        return largest;
    }


    public static void main(String[] ags)
    {
        int[] arr={2,3,1,4,5};
        int result=largestarr(arr);
        System.out.println(result);
    }
}
