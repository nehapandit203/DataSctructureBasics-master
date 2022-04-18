package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    public static void main(String[] args) {
        String characters = "faadabcbbebdf";
        System.out.println(firstNonRepeating(characters));
    }

    private static int firstNonRepeating(String word) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (charFrequency.get(c) == 1)
                return i;
        }
        return -1;
    }


}
