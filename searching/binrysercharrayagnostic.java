package searching;

public class binrysercharrayagnostic {

        //return -1 if it does not exist
        public static int bserchagnostic(int[] arr,int target)
        {
            int start=0;
            int end=arr.length-1;
        //find whether the array is assendin or desending
            boolean isasc=arr[start]<arr[end];

            while (start<=end)
            {
                //    int mid=(start+end)/2; it might possible that (start+end) excide the range of int
                int mid=start + (end-start)/2;
                if(target ==arr[mid])
                {
                    return mid;
                }
                if(isasc)
                {
                    if(target>arr[mid])
                    {
                        end=mid-1;
                    }else {
                        start = mid + 1;
                    }
                }
                else {

                    if(target>arr[mid])
                    {
                        end=mid-1;
                    }else {
                        start = mid + 1;
                    }
                }
            }
            return -1;//not foud element
        }
        public static void main(String[] args)
        {
           // int[] arr={-8,-9,0,7,8,9,78};
            int[] arr={90,80,70,56,4,3,-1};
            int ans=bserchagnostic(arr,90);
            System.out.println(ans);
        }
}
