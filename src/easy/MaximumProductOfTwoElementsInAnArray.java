package easy;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {

        int n = nums.length-1;
        Arrays.sort(nums);

        int prod = (nums[n]-1) * (nums[n-1]-1);

        return prod;
    }
}
