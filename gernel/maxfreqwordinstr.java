package gernel;
import java.util.*;

 class imaxfreqwordinstr {
    public static void main(String[] args) {
        String str = "heiio hi fr hi sbs hi";
        String[] str1 = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // Count occurrences of each word
        for (String s : str1) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        // Printing word frequencies
        map.forEach((a, b) -> {
            System.out.println(a + " " + b);
        });

        // Find the word with the maximum frequency
        int maxFreq = 0;
        String maxFreqWord = ""; // Variable to store the word with max frequency

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqWord = entry.getKey(); // Update the word with max frequency
            }
        }

        // Print the word with maximum frequency
        System.out.println("Max frequency word: " + maxFreqWord + " with frequency: " + maxFreq);
    }
}