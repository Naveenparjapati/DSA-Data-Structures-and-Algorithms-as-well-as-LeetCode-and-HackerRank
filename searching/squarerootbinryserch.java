package searching;

public class squarerootbinryserch {

        public static void main(String[] args) {
            long number = 25; // Example number
            long result=findSquareRoot(number);
            System.out.printf("The square root of +",number, result);
        }

        public static long findSquareRoot(long n )
        {

            long  start =1;
            long end = n;
            long ans = 0;

            while (start<=end) {
              long  mid = start + ( end-start) / 2;

                if (mid * mid == n) {
                   return ans=mid; // Found the exact square root
                } else if (mid * mid < n) {
                   start= mid+1;        // Move to the right half
                    ans = mid;
                } else {
                    end = mid-1; // Move to the left half
                }
            }

            // Return the mid value as the approximate square root
            return ans;
        }
    }

