package recursion;

public class binaryserchrecur {
  static int   bser(int[] arr,int target,int s,int e)
    {
         if(s>e)
         {
             return -1;
         }
         int m=s+(e-s)/2;
         if(arr[m]==target){
             return m;
         }
         if(target<arr[m])
        {
           return bser(arr, target, s, m-1);
        }
         return bser(arr,target,m+1,e);
    }
    public static void main(String[] args)
    {
        int[] arr={3,5,8,9};
        int target=9;
       System.out.println( bser(arr, target, 0, arr.length-1));
    }
}
