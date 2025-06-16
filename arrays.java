public class arrays {
    //linear searching
    public static int serchingelement(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={12,43,23,21};
        int target=21;
        int result=serchingelement(arr,target);
        System.out.println(result);
    }
}
