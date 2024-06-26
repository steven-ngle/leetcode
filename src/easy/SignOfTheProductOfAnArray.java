package easy;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {

        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] > 0) {
                nums[i] = 1;
            } else {
                nums[i] = -1;
            }
            prod *= nums[i];
        }

        if (prod > 0) return 1;
        else return -1;
    }
}
