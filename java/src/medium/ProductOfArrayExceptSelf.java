package medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int[] leftProd = new int[nums.length];
        leftProd[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }

        int rightProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = leftProd[i] * rightProd;
            rightProd *= nums[i];
        }

        return res;
    }
}
