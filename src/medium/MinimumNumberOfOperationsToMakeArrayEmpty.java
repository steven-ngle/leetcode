package medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {

    public int minOperations(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int counter = 0;
        for (int val : map.values()) {
            if (val == 1) return -1;

            counter += val / 3;
            if (val % 3 != 0) counter++;
        }

        return counter;
    }
}
