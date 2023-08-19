package easy;

import java.util.Arrays;
public class MajorityElement {
    // EASY
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}
