package easy;

import java.util.HashMap;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {

        int counter = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = "balloon";

        for (char c : text.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        while (true) {
            for (char c : s.toCharArray()) {
                if (hm.containsKey(c) && hm.get(c) > 0) {
                    hm.put(c, hm.get(c) - 1);
                } else {
                    return counter;
                }
            }
            counter++;
        }
    }
}
