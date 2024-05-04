package easy;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {

    public int maximizeSum(int[] nums, int k) {

        Arrays.sort(nums);
        int sum = 0;
        int max = nums[nums.length - 1];

        for (int i = 0; i < k; i++) {
            sum += max;
            max++;
        }

        return sum;
    }
}
