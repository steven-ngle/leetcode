package easy;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    // EASY
    public int findNonMinOrMax(int[] nums) {

        int m = nums.length;
        int n = m / 2;

        Arrays.sort(nums);

        if (nums.length <= 2) {
            return -1;
        } else {
            return nums[n];
        }
    }
}
