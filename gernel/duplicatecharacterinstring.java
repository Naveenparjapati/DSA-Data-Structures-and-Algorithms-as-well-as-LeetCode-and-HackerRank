package gernel;
import java.util.HashMap;
public class duplicatecharacterinstring {

    static void dup(String input) {
        // Use a HashMap to count occurrences of each character
        HashMap<Character, Integer> charCount = new HashMap<>();
        // Convert the input string to a character array
        char[] ch = input.toCharArray();
        // Count occurrences of each character
        for (char c : ch) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Print characters that have duplicates
        System.out.println("Duplicate characters and their counts:");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println("Character: '" + c + "', Count: " + charCount.get(c));
            }
        }
    }
    public static void main(String[] args) {
        String input = "programming";
        dup(input);
    }
}