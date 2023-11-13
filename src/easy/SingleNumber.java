package easy;

import java.util.Arrays;

public class SingleNumber {

    /** first try
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i = i+2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
     */

    public int singleNumber(int[] nums) {

        int ans = nums[0];
        int i = 0;

        while (i < nums.length - 1) {
            ans = ans ^ nums[i + 1];
            i++;
        }

        return ans;
    }
}
