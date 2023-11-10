package easy;

import java.util.HashMap;

public class MinimizeStringLength {

    public int minimizedStringLength(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int res = s.length();
        int counter = 0;

        for (Character c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if (hm.get(c) > 1) {
                counter++;
            }
        }

        return res - counter;
    }
}
