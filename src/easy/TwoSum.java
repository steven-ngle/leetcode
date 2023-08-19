package easy;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int n = i + 1; n < nums.length; n++) {
                sum = nums[i] + nums[n];
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = n;
                    return arr;
                }
            }
        }
        return arr;
    }

}

