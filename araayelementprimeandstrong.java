public class araayelementprimeandstrong {

    public static void main(String[] args) {
        int[] numbers ={155,145,157,188,199,161};
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 1;
        }


        for (int i = 1; i < numbers.length; i++) {
            boolean isPrime = isPrime(numbers[i]);
            boolean isStrong = isStrong(numbers[i]);


            if (isPrime && isStrong) {
                System.out.println(numbers[i] + "this number is  both a prime and a strong number.");
            }
        }
    }

    //  prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //  strong number
    public static boolean isStrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }


    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

