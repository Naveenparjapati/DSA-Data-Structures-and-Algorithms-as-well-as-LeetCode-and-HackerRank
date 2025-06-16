package gernel;
import java.util.TreeSet;
import java.util.HashSet;

public class predrive2 {
        public static void main(String[] args) {
            int[] arr = {23, 45, 12, 67, 89, 34};
            HashSet<Integer> usum = new HashSet<>();

            // Calculate sums of pairs
            for (int i = 0; i < arr.length; i++) {
                for (int k = i; k < arr.length; k++) {
                    int sum = arr[i] + arr[k];

                    int result= dublicatesumrem(sum);
                    usum.add(result);
                }
            }
            System.out.println(usum);
        }

        private static int dublicatesumrem(int number) {
            TreeSet<Character> unDig = new TreeSet<>();
            for (char digit : Integer.toString(number).toCharArray()) {
                unDig.add(digit);
            }
            StringBuilder result = new StringBuilder();
            for (char digit : unDig) {
                result.append(digit);
            }
            return Integer.parseInt(result.toString());
        }
    }

