package gernel;


 class lexograpicand {
    public static void main(String[] args) {
        String sentence = "apple banana cherry date"; // Change this to test different sentences

        // Step 1: Split the sentence into words
        String[] words = sentence.split(" ");
        // Step 2: Check if the words are in lexicographic order
        boolean isInOrder = true; // Assume the sentence is in order initially
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0) {
                isInOrder = false; // Found a pair that is out of order
                break;
            }
        }
        // Step 3: Output the result
        if (isInOrder) {
            System.out.println("The sentence is in lexicographic order.");
        } else {
            System.out.println("The sentence is not in lexicographic order.");
        }}}