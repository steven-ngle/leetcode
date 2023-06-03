public class TwoSum {

    public static void main(String[] args) {
        // :)
    }
    public int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                sum = nums[i] + nums[k];
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = k;
                    return arr;
                }
            }
        }
        return arr;
    }

}

