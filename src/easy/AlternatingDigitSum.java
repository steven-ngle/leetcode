package easy;

public class AlternatingDigitSum {

    public int alternateDigitSum(int n) {

        int sum = 0;
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] *= -1;
            }
        }

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
