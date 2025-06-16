public class pri100 {
    public static void main(String[] args) {
       //"Odd prime numbers 100
        for (int num = 3; num <= 100; num += 2) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}