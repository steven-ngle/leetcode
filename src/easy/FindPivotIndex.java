package easy;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {

        int leftSum = 0;
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
