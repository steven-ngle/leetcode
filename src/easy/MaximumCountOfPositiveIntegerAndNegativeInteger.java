package easy;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public int maximumCount(int[] nums) {

        int pos = 0;
        int neg = 0;

        for (int i : nums) {
            if (i > 0) {
                pos++;
            } else if (i < 0) {
                neg++;
            }
        }

        if (pos > neg) {
            return pos;
        }

        return neg;
    }
}
