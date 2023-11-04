package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (hm.containsKey(i) && hm.get(i) > 0) {
                hm.put(i, hm.get(i) - 1);
            } else {
                res.add(i);
            }
        }

        return res;
    }
}
