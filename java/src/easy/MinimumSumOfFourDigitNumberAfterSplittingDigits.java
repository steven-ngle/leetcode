package easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public int minimumSum(int num) {

        int[] arr = new int[2];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum = num % 10;
            arr[i] = sum;
            num /= 10;
        }

        Arrays.sort(arr);
        int new1 = arr[0] * 10 + arr[3];
        int new2 = arr[1] * 10 + arr[2];

        return new1 + new2;
    }
}

