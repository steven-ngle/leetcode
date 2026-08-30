package easy;

import java.util.LinkedHashSet;

public class KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        LinkedHashSet<String> distinctSet = new LinkedHashSet<>();

        for (String s : arr) {
            if (!set.contains(s)) {
                set.add(s);
                distinctSet.add(s);
            } else {
                distinctSet.remove(s);
            }
        }

        int count = 0;
        for (String element : distinctSet) {
            count++;
            if (count == k) return element;
        }

        return "";
    }
}
