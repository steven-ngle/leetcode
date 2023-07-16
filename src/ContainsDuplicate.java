import java.util.Arrays;

public class ContainsDuplicate {
    // EASY

/*    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];

            for(int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
time limit exceeded */

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                    return true;
            }
        }
        return false;
    }
}