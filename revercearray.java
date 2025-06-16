public class revercearray {
    public static void main(String[] args)
    {
        int[] arr={4,3,2,1};
        int count=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" array element"+arr[i]);
            count++;
        }
        System.out.println(" counting total element" +count);
    }
}
