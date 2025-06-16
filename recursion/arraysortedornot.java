package recursion;

public class arraysortedornot {
    public static void main(String[] args)
    {
        int[] arr={1,1,2,3,4,5};
        System.out.print(sortedornot(arr,0));
    }
    public static boolean sortedornot(int[] arr,int index )
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<=arr[index+1] && sortedornot(arr,index+1);
    }
}
