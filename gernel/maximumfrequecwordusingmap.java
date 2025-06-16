package gernel;

import java.util.HashMap;
import java.util.Map;

class maximumfrequentwordusingmap {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog the quick brown fox";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String str : words) {
            if (wordCountMap.containsKey(str)) {
                wordCountMap.put(str, wordCountMap.get(str) + 1); // Corrected this line
            } else {
                wordCountMap.put(str, 1);
            }
        }

        wordCountMap.forEach((word, count) -> {
            System.out.println(word + " " + count);
        });
    }
}