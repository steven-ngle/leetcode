package easy;

import java.util.HashMap;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int counter = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : stones.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : jewels.toCharArray()) {
            if (hm.containsKey(c)) {
                counter += hm.get(c);
            }
        }

        return counter;
    }
}
