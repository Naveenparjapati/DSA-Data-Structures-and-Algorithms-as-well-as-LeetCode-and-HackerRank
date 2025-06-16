package gernel;

public class kth2largestfroarray {
    public static void main(String[] args)
    {
        int[] arr={3,2,1,5,6,4};
        int largest=0,secondLargest=0;
        for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]>largest)
          {
              secondLargest = largest; // Update second largest
              largest = arr[i]; // Update largest
          } else if (arr[i] > secondLargest && arr[i] != largest) {
              secondLargest = arr[i]; // Update second largest if it's not equal to largest
          }

        }
        System.out.print(secondLargest);
    }
}
