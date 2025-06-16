public class array2 {
    public static int serching(int[] arr,int target)
    {
        for(int element:arr)
        {
            if(element == target)
            {
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={21,56,23,43,23};
        int target=23;
        int result=serching(arr,target);
        System.out.println(result);
    }
}
