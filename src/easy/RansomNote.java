package easy;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (hm.containsKey(c) && hm.get(c) > 0) {
                hm.put(c, hm.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
