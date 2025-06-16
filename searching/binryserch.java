package searching;

public class binryserch {
    //return -1 if it does not exist
    public static int bserch(int[] arr,int target)
    {
      int start=0;
      int end=arr.length-1;

      while (start<=end)
      {
      //    int mid=(start+end)/2; it might possible that (start+end) excide the range of int
      int mid=start + (end-start)/2;
      if(target < arr[mid])
      {
          end=mid-1;
      }else if(target > arr[mid])
      {
          start=mid+1;
      }else {
          //target is found
          return mid;
      }
      }
      return -1;//not foud element
    }
    public static void main(String[] args)
    {
int[] arr={-8,-9,0,7,8,9,78};
int ans=bserch(arr,7);
System.out.println(ans);
    }
}
