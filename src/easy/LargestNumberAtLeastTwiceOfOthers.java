package easy;

import java.util.HashMap;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {

        int max = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
        }
    }
}
