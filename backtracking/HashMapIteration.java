
package backtracking;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number string pairs  ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter key-value pair " + (i + 1) + ": ");
            System.out.print("Key: ");
            String key = scanner.nextLine();
            System.out.print("Value: ");
            String value = scanner.nextLine();
            map.put(key, value); // Insert into HashMap
        }

        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}