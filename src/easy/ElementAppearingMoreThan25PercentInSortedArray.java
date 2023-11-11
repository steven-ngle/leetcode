package easy;

import java.util.HashMap;

public class ElementAppearingMoreThan25PercentInSortedArray {

    public int findSpecialInteger(int[] arr) {

        int max = 0;
        int num = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Integer i : arr) {
            if (hm.get(i) > max) {
                num = i;
                max = hm.get(i);
            }
        }

        return num;
    }
}
