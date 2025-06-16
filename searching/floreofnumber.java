package searching;
public class floreofnumber {
    //return -1 if it does not exist
    //greate number =< targert
        public static int fllor(int[] arr, int target)
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
            return end;//not foud element
        }
        public static void main(String[] args)
        {
            int[] arr={1,3,5,8,14,16};
            int ans= fllor(arr,5);
            System.out.println(ans);
        }
    }




