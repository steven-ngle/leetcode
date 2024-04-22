package easy;


public class CountTheDigitsThatDivideANumber {

    public int countDigits(int num) {

        if (num <= 9) return 1;

        int count = 0;
        int i = 0;
        int num1 = num;

        while (i < String.valueOf(num).length()) {
            int n = num1 % 10;
            num1 /= 10;

            if (num % n == 0) count++;
            i++;
        }

        return count;
    }
}
