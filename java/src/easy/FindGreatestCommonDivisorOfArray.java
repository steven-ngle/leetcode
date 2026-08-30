package easy;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int res = 0;

        for (int i = 1; i <= nums[nums.length - 1]; i++) {
            if ((nums[0] % i == 0) && (nums[nums.length - 1] % i == 0)) res = i;
        }

        return res;
    }
}
