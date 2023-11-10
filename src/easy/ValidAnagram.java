package easy;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!hm.containsKey(c) || hm.get(c) == 0) {
                return false;
            }
            hm.put(c, hm.get(c) - 1);
        }

        return true;
    }
}
