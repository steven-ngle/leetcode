package easy;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInAnArray {

    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = -1;

        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}
