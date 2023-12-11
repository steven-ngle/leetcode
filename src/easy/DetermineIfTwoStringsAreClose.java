package easy;

import java.util.Arrays;
import java.util.HashSet;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        HashSet<Integer> set = new HashSet<>();

        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
            set.add(c - 'a');
        }

        for (char c : word2.toCharArray()) {
            if (set.contains(c - 'a')) {
                arr2[c - 'a']++;
            } else {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
