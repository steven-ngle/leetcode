package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();

        for (Integer i : nums1) {
            num1.add(i);
        }

        for (Integer i : nums2) {
            num2.add(i);
        }

        for (Integer i : num1) {
            if (!num2.contains(i)) {
                temp1.add(i);
            }
        }


        for (Integer i : num2) {
            if (!num1.contains(i)) {
                temp2.add(i);
            }
        }

        res.add(temp1);
        res.add(temp2);

        return res;
    }
}
