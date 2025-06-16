import java.util.Arrays;
public class increasingordeacrisingorderarray {
    public static void main(String[] args)
    {
        int[] arr={1,4,2,3};
        System.out.println("orignal array");
        System.out.println(Arrays.toString(arr));

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
     System.out.println(" orignal array after increment ");
     System.out.println(Arrays.toString(arr));
    }
}
