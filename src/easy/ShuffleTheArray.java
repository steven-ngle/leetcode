package easy;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];
        int j = 0;

        for (int i = 0; i < nums.length; i+=2) {
            result[i] = nums[j];
            result[i+1] = nums[j+n];
            j++;
        }
        return result;
    }
}
