package searching;
import java.util.Arrays;
 class selectionsort {
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args)
    {
    int[] arr={21,13,1,3,22};
   sort(arr);
    System.out.print(Arrays.toString(arr));
    }

}
