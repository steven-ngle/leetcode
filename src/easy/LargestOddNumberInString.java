package easy;

import java.math.BigInteger;

public class LargestOddNumberInString {

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = (int) num.charAt(i);
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
