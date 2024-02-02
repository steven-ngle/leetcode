package easy;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCharactersToMakeTargetString {

    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();


        for (char c : s.toCharArray()) {
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }

        for (char c : target.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        int maxCopies = Integer.MAX_VALUE;

        for(char c : tmap.keySet()) {
            if (smap.containsKey(c)) maxCopies = Math.min(maxCopies, smap.get(c) / tmap.get(c));
            else return 0;
        }

        return maxCopies;
    }
}
