package searching;

public class cellingfinding {

        //return -1 if it does not exist
    //smallect number greater t>= target
        public static int celling(int[] arr, int target)
        {
            //but if the target number is greater then the number in array
            if(target>arr[arr.length-1])
            {
                return -1;
            }
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
            return start;//not foud element
        }
        public static void main(String[] args)
        {
            int[] arr={1,3,5,8,14,16};
            int ans= celling(arr,17);
            System.out.println(ans);
        }
    }


