package predrive;

class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class cpoli {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Calling the add method with two integers
        int sum1 = mathOps.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Calling the add method with three integers
        int sum2 = mathOps.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Calling the add method with two double values
        double sum3 = mathOps.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
