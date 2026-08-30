package easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(hm.values());

        return set.size() == hm.size();
    }
}
