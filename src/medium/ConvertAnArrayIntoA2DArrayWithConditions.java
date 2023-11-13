package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (Integer i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            set.add(i);
        }

        while (!hm.isEmpty()) {
            List<Integer> temp = new ArrayList<>();

            for (Integer i : set) {

                if (hm.containsKey(i)) {
                    temp.add(i);

                    if (hm.get(i) == 1) {
                        hm.remove(i);
                    } else {
                        hm.put(i, hm.get(i) - 1);
                    }
                }
            }

            res.add(temp);
        }

        return res;
    }
}
