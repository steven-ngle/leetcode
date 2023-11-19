package medium;

public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        int smallest = nums[0];
        int secondSmallest = nums[1];
        int thirdSmallest = nums[2];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        return false;
    }
}
