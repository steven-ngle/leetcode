package medium;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {

    // Two Pointer Approach
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int counter = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                counter++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return counter;
    }

    // HashMap Approach
    public int maxOperations1(int[] nums, int k) {

        int counter = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = k - nums[i];
            if (hm.containsKey(temp)) {
                counter++;
                if (hm.get(temp) == 1) {
                    hm.remove(temp);
                } else {
                    hm.put(temp, hm.get(temp) - 1);
                }
            } else {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
        }

        return counter;
    }
}
