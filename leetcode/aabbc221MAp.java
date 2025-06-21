package leetcode;

import java.util.HashMap;
import java.util.Map;

public class aabbc221MAp {
    public static void main(String[] args) {
        String str = "aabbc";
        Map<Character, Integer> map = new HashMap<>();

        // Corrected the loop to use char instead of int
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Printing the character counts
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
