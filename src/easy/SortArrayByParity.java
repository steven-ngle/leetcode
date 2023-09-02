package easy;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        int[] arr = new int[nums.length];
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[n] = nums[i];
                n++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[n] = nums[i];
                n++;
            }
        }
        return arr;
    }
}
