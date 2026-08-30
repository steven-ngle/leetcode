package easy;

import java.util.LinkedHashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
