package easy;


public class FindTheSumOfEncryptedIntegers {

    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;
        for (int i : nums) {
            sum += encrypt(i);
        }

        return sum;
    }

    private int encrypt(int x) {

        String num = String.valueOf(x);
        if (num.length() == 1) return x;

        int max = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.valueOf(num.charAt(i)) - '0';
            max = Math.max(digit, max);
        }

        int encrypted = 0;
        for (int i = 0; i < num.length(); i++) {
            encrypted += max * Math.pow(10, num.length() - i - 1);
        }

        return encrypted;
    }
}
