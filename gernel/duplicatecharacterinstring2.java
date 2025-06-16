package gernel;

public class duplicatecharacterinstring2 {
    static void duplicateCount(String input) {
        // Convert the input string to a character array
        char[] ch = input.toCharArray();

        System.out.println("Duplicate characters:");

        // Iterate through the character array
        for (int i = 0; i < ch.length; i++) {
            int count = 1; // Start count for the current character

            // Check if the character is already counted
            if (ch[i] != '\0') { // Check if the character is not already counted
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        count++; // Increment count for duplicates
                        ch[j] = '\0'; // Mark as counted
                    }
                }

                // Print the character and its count if it's a duplicate
                if (count > 1) {
                    System.out.println("Character: '" + ch[i] + "', Count: " + count);
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming"; // Example input
        duplicateCount(input);
    }
}