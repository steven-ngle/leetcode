package easy;

public class SearchInsertPosition {

/**    first try O(n)

        public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    } */

// second try O(log n)
        public int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;
            int middle;

            while (left <= right) {

                middle = (left + right) / 2;

                if (target == nums[middle]) {
                    return middle;
                } else if (target > nums[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            return left;
        }
}
