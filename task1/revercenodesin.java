package task1;
//find midian of two sorted array with diffrent leangth

public class  revercenodesin{


        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int[] mergedArray = mergeArrays(nums1, nums2);
            int n = mergedArray.length;
            if (n % 2 == 1) {
                return mergedArray[n / 2];
            }
            return (mergedArray[(n - 1) / 2] + mergedArray[n / 2]) / 2.0;
        }

        private static int[] mergeArrays(int[] nums1, int[] nums2) {
            int i = 0, j = 0, k = 0;
            int[] merged = new int[nums1.length + nums2.length];
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    merged[k++] = nums1[i++];
                } else {
                    merged[k++] = nums2[j++];
                }
            }


            while (i < nums1.length) {
                merged[k++] = nums1[i++];
            }


            while (j < nums2.length) {
                merged[k++] = nums2[j++];
            }

            return merged;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2};
            int[] nums2 = {3, 4};
            System.out.println("Median: " + findMedianSortedArrays(nums1, nums2)); // Output: 2.5
        }
    }