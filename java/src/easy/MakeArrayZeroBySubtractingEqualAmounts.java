package easy;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {

    public int minimumOperations(int[] nums) {

        int x = 0;
        int counter = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                x = nums[i];
                counter++;

                for (int j = i; j < nums.length; j++) {
                    nums[j] -= x;
                }
            }
        }
        return counter;
    }
}
