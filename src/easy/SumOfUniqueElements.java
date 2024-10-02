package easy;

import java.util.HashMap;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1) sum += i;
        }

        return sum;
    }
}
