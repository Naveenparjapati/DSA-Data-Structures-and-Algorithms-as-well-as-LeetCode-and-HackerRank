package searching;
import java.util.*;
public class array010 {

        public static int binaryserch(int[] arr)
        {
            int start=0;
            int end=arr.length-1;
            while (start < end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1])
                {
                    //you are in ecending part of an Array
                    //this may be the answer byt look at left Stde
                    //this is why end!=mid-1
                    end=mid;
                }
                else{
                    //serching desc part of an array
                    start=mid+1;//bcz we know the mid+1 is greater then the mid element

                }
            }
            //in th end start==end bcz pointing to the large number bcz of the two check above
            //start and end alwas trying to find the max element in the above to checks
            //hence when they pointing to one element that is the max element
            return start;
        }
        public static void main(String[] args) {
            int[] arr={0,1,0};
            int result= binaryserch(arr);
            System.out.println(result);
        }
    }

