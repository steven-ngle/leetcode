package medium;

public class SortColors {

    public void sortColors(int[] nums) {
        // Dutch National Flag Problem
        // https://en.wikipedia.org/wiki/Dutch_national_flag_problem
        // https://www.youtube.com/watch?v=BOt1DAvR0zI

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
