package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {

        String s = Arrays.toString(nums);
        List<Integer> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (isSkippable(c)) continue;

            list.add(Character.getNumericValue(c));
        }

        int[] res = list.stream().mapToInt(i -> i).toArray();

        return res;
    }

    private boolean isSkippable(char c) {
        return (c == '[' || c == ']' || c == ',' || Character.isWhitespace(c));
    }
}
