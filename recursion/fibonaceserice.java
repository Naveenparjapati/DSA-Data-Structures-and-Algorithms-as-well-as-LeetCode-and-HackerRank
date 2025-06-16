package recursion;
public class fibonaceserice {
    // Method to calculate Fibonacci number
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // Method to print Fibonacci series up to 'terms' number of terms
    public static void printFibonacciSeries(int terms) {
        for (int i = 0; i < terms; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static void main(String[] args) {
        int terms = 5; // Change this value to print more or fewer terms
        System.out.print("Fibonacci series up to " + terms + " terms: ");
        printFibonacciSeries(terms);
    }
}