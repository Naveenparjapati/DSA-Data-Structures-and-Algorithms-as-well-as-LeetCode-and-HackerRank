package backtracking;
import java.util.Scanner;
public class DEctoBInary {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("enter number  ");
            int decimal = scanner.nextInt();
            String binary = conve(decimal);
            System.out.println("output" + binary);
        }

        public static String conve(int decimal) {
            StringBuilder binary = new StringBuilder();
            if (decimal == 0) {
                return "0";
            }

            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal = decimal / 2;
            }
            return binary.toString();
        }
    }

