package easy;

import java.util.HashMap;

public class MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = -1, res = -1;

        for (int i : nums) {
            if (i % 2 == 0) {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
        }

        for (var entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            } else if (entry.getValue() == max && res > entry.getKey()){
                res = entry.getKey();
            }
        }

        return res;
    }
}
