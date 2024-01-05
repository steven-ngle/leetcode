package easy;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int temp = 0;
        for (int val : map.values()) {
            if (temp == 0) temp = val;
            if (val != temp) return false;
            temp = val;
        }

        return true;
    }
}
