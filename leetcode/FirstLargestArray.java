package leetcode;




public class FirstLargestArray {

    public static void largest(int[] arr)
    {
        int larg=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>larg)
            {
                larg=arr[i];
            }
        }

        System.out.println("second largest "+larg);

    }

    public static void main(String[] args) {
            int[] arr={1,5,2,7,10,66};
             largest(arr);
        }
    }

