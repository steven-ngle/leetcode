package medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public int minSteps(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int counter = 0;
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            char key = entry.getKey();
            if (tMap.containsKey(key)) {
                if (entry.getValue().equals(tMap.get(key))) {
                    counter += entry.getValue();
                } else {
                    counter += Math.min(entry.getValue(), tMap.get(key));
                }
            }
        }

        return s.length() - counter;
    }
}
