package easy;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int l = heights.length;
        int[] expected = Arrays.copyOf(heights, l);
        Arrays.sort(expected);
        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                counter++;
            }
        }

        return counter;
    }
}
