package stringprograms;

public class prime100 {

        public static void main(String[] args) {
            int countPrimes = 0;

            for (int n = 2; n <= 100; n++) {
                if (isPrime(n)) {
                    System.out.println(n + " is a prime number");
                    countPrimes++;
                }
            }

            System.out.println("Total prime numbers up to 100: " + countPrimes);
        }

        // Function to check if a number is prime
        public static boolean isPrime(int num) {
            if (num < 2) return false;

            for (int i = 2; i * i <= num; i++) { // Optimized check (i * i ≤ num)
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


