package easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        return list;
    }
}
