package easy;

import java.util.HashMap;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int missing = 0;

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (hm.containsKey(i) && hm.get(i) > 0) {
                hm.put(i, hm.get(i) - 1);
            } else {
                missing = i;
            }
        }

        return missing;
    }
}
