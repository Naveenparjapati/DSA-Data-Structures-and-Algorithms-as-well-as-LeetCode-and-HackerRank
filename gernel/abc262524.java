package gernel;

public class abc262524 {
    public static void main(String[] args) {
        String s = "abca";
        int sum = 0;
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int position = ch - 'a' + 1; // Get the position of the character (1 for 'a', 2 for 'b', etc.)
            int oppositePosition = 27 - position; // Calculate the opposite position (1 -> 26, 2 -> 25, etc.)
            sum += position * oppositePosition; // Multiply and add to sum
        }
        System.out.println(sum); // Output: 252
    }
}