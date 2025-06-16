 class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " i am a coder ";
        String trimString = str.trim(); // Trim leading and trailing spaces
        int count = 0;

        // Start from the end of the trimmed string
        for (int i = trimString.length() - 1; i >= 0; i--) {
            if (trimString.charAt(i) != ' ') { // Use ' ' for character comparison
                count++;
            } else {
                break; // Stop counting when a space is encountered
            }
        }
        System.out.println(count); // Output the length of the last word
    }
}