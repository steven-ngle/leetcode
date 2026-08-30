package easy;

import java.util.Comparator;
import java.util.TreeMap;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {

        String[] result = new String[names.length];
        TreeMap<Integer, String> sorted = new TreeMap<>(Comparator.reverseOrder());
        int i = 0;
        int j = 0;

        while (i < names.length) {
            sorted.put(heights[i], names[i]);
            i++;
        }

        for (String str : sorted.values()) {
            result[j++] = str;
        }

        return result;
    }
}
