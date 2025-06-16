import java.util.Arrays;
public class sortingarrayinasendingordesedingorder {
    public static void main(String[] args)
    {

        int[] arr={3,5,1,2,7,9,12};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
