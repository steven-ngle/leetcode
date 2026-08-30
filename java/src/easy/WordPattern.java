package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (!map.containsKey(c)) {
                if (set.contains(words[i])) {
                    return false;
                }

                map.put(c, words[i]);
                set.add(words[i]);
            } else {
                if (!map.get(c).equals(words[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
