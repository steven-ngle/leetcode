package easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] smaller = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int min = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    min++;
                }
            }
            smaller[i] = min;
        }
        return smaller;
    }
}
