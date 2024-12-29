package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfMultipleArrays {

    public List<Integer> intersection(int[][] nums) {

        Set<Integer> common = new HashSet<>();
        for (int num : nums[0]) {
            common.add(num);
        }

        for (int i = 1; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int num : nums[i]) {
                temp.add(num);
            }
            common.retainAll(temp);
        }

        List<Integer> res = new ArrayList<>(common);

        return res;
    }
}
